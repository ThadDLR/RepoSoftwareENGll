
/**
 *
 * @author Nick&Tori
 */

import java.sql.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headeresults in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick&Tori
 */
public class ecsDB {
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/ecs";
    private final String USER_NAME = "root";
    private final String PASSWORD = "Oberhofer!!0";//<---add your own DB PW
    //behavioresults
    
     public ArrayList<User> validateUser(String un, String pw) throws ClassNotFoundException, SQLException{

      ArrayList<User>list=new ArrayList<User>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL="SELECT userName, password, userPosition FROM ecs.users where userName='"+un+"' and password='"+pw+"'";
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {

        
          String userName = results.getString(1);
          String password = results.getString(2);
          int position =results.getInt(3);
         
          User row = new User(userName,password,position);
          list.add(row);

      }
      conn.close();

      return list;

  }
    
    public ArrayList<Reports> getContingencyRec(boolean filter, String filterString) throws ClassNotFoundException, SQLException{

      ArrayList<Reports>list=new ArrayList<Reports>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL="";
      if(filter==true){
      strSQL="SELECT * FROM ecs.contengencies where name like '%"+filterString+"%' or userId like '%"+filterString+"%'or transactionType like '%"+filterString+"%' or equipmentName like '%"+filterString+"%'";
      }
      else{strSQL="SELECT * FROM ecs.contengencies;";}
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {

          int transactionID =results.getInt(1);
          String transactionType = results.getString(2);
          String equipmentName = results.getString(3);
          double price =results.getDouble(4);
          String userName = results.getString(5);
          int userID =results.getInt(6);

          Reports row = new Reports(transactionID,transactionType,equipmentName,price,userName,userID);
          list.add(row);

      }
      conn.close();

      return list;

  }
 public ArrayList<Reports> getAllTransactions(boolean filter, String filterString) throws ClassNotFoundException, SQLException{

      ArrayList<Reports>list=new ArrayList<Reports>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL="";
      if(filter==true){
      strSQL="SELECT \n" +
"        `et`.`transactionId` AS `transactionId`,\n" +
"        `et`.`transactionType` AS `transactionType`,\n" +
"        `e`.`equipmentName` AS `equipmentName`,\n" +
"        `e`.`price` AS `price`,\n" +
"        `user`.`name` AS `name`,\n" +
"        `user`.`userId` AS `userId`,\n" +
"        `buil`.`buildingName`\n" +
"    FROM\n" +
"        ((`ecs`.`equipment_transactions` `et`\n" +
"        JOIN `ecs`.`equipment` `e` ON ((`e`.`equipmentId` = `et`.`equipmentId`)))\n" +
"        JOIN `ecs`.`users` `user` ON ((`user`.`userId` = `et`.`userId`)))\n" +
"        inner join `ecs`.`building` `buil` on `e`.`buildingId`=`buil`.`buildingId`\n" +
"         where name like '%"+filterString+"%' or user.userId like '%"+filterString+"%'or et.transactionType like '%"+filterString+"%' or equipmentName like '%"+filterString+"%'";
      }
      else{strSQL="    SELECT \n" +
"        `et`.`transactionId` AS `transactionId`,\n" +
"        `et`.`transactionType` AS `transactionType`,\n" +
"        `e`.`equipmentName` AS `equipmentName`,\n" +
"        `e`.`price` AS `price`,\n" +
"        `user`.`name` AS `name`,\n" +
"        `user`.`userId` AS `userId`,\n" +
"        `buil`.`buildingName`\n" +
"    FROM\n" +
"        ((`ecs`.`equipment_transactions` `et`\n" +
"        JOIN `ecs`.`equipment` `e` ON ((`e`.`equipmentId` = `et`.`equipmentId`)))\n" +
"        JOIN `ecs`.`users` `user` ON ((`user`.`userId` = `et`.`userId`)))\n" +
"        inner join `ecs`.`building` `buil` on `e`.`buildingId`=`buil`.`buildingId`\n" +
"         ";}
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {

          int transactionID =results.getInt(1);
          String transactionType = results.getString(2);
          String equipmentName = results.getString(3);
          double price =results.getDouble(4);
          String userName = results.getString(5);
          int userID =results.getInt(6);
          String buildingName =results.getString(7);


          Reports row = new Reports(transactionID,transactionType,equipmentName,price,userName,userID,buildingName);
          list.add(row);

      }
      conn.close();

      return list;

  }
   public ArrayList<Reports> getUserContingencyRec() throws ClassNotFoundException, SQLException{

      ArrayList<Reports>list=new ArrayList<Reports>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL="SELECT * FROM ecs.user_contengencies_count;";
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {

          String name = results.getString(1);
          int userID =results.getInt(2);
          int contingency =results.getInt(3);

          Reports row = new Reports(name,userID,contingency);
          list.add(row);

      }
      conn.close();

      return list;

  }
    public ArrayList<Reports> getBuildingReport(String x) throws ClassNotFoundException, SQLException{
System.out.print(x);
      ArrayList<Reports>list=new ArrayList<Reports>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL=" SELECT \n" +
"        `e`.`equipmentId` AS `equipmentId`,\n" +
"        `e`.`equipmentName` AS `equipmentName`,\n" +
"        `e`.`price` AS `price`,\n" +
"        `e`.`dateAdded` AS `dateAdded`,\n" +
"        `build`.`buildingName` AS `buildingName`\n" +
"    FROM\n" +
"        (`ecs`.`equipment` `e`\n" +
"        JOIN `ecs`.`building` `build` ON ((`e`.`buildingId` = `build`.`buildingId`)))\n" +
"    WHERE\n" +
"        (`build`.`buildingId` = "+x+")";
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {
          int equipmentId =results.getInt(1);
          String equipmentName =results.getString(2);
          Double price = results.getDouble(3);
          String dateAdded =results.getString(4);
          String buildingName =results.getString(5);

          Reports row = new Reports(  equipmentId,  equipmentName,  price,  dateAdded,  buildingName);
          list.add(row);
          //System.out.println(row);

      }
      conn.close();

      return list;

  }
    
   public ArrayList<Equipment> getEquipment(int getType, int userId) throws ClassNotFoundException, SQLException
            {
               ArrayList<Equipment> equipList = new ArrayList<Equipment>();
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               
               Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
                              String sqlStr = "";

               if(getType==2){
               
                  sqlStr="SELECT e.equipmentId,e.equipmentName,e.price,e.status,e.buildingId, e.dateAdded FROM equipment e\n" +
"left join ecs.equipment_transactions et on e.equipmentId=et.equipmentId where userId="+userId+" and not status=\"available\" group by e.equipmentId order by et.transactionId desc ";}
               else{  sqlStr = "SELECT * FROM ecs.equipment ;";}

               Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery(sqlStr);
               
               while(rs.next())
                {
                int equipmentId = rs.getInt(1);
                String equipmentName = rs.getString(2);
                String price = rs.getString(3);
                String status = rs.getString(4);
                int buildingId = rs.getInt(5);
                String dateAdded = rs.getString(6);
                
            
                Equipment equipment = new Equipment(equipmentId, equipmentName, Double.parseDouble(price), status, buildingId,
                    dateAdded);
            
                equipList.add(equipment);
            
                }
                con.close();
               
                return equipList;
                
            }
     
 public void equipmentCheckOut ( Equipment equipment, String transType, int userId) throws ClassNotFoundException, SQLException
    {
        System.out.println("in the checkout function");
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        String sqlStr = "UPDATE equipment SET equipmentName = (?),price = (?),status = (?),buildingId = (?),dateAdded = (?)" 
                +"WHERE equipmentId = (?)";
        PreparedStatement pstmt = con.prepareStatement(sqlStr);
        pstmt.setString(1,equipment.getName());
        pstmt.setDouble(2, equipment.getPrice());
        pstmt.setString(3, equipment.getStatus());
        pstmt.setInt(4, equipment.getBuildingId());
        pstmt.setString(5, equipment.getDateAdded());
        pstmt.setInt(6, equipment.getId());
        
        pstmt.execute();
        con.close();
        
        Transactions transaction = new Transactions(transType, equipment.getId(),userId);
        enterTransaction( transaction);
    }
          
            public void add (Equipment equipment) throws ClassNotFoundException, SQLException
     {
       Class.forName("com.mysql.cj.jdbc.Driver");
        
       Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
       String sqlStr = "INSERT INTO equipment (equipmentId, equipmentName, price, status, buildingId, dateAdded)"
       + " VALUES (?,?,?,?,?,?)";
       PreparedStatement pstmt = con.prepareStatement(sqlStr);
       pstmt.setInt(1, equipment.getId());
       pstmt.setString(2, equipment.getName());
       pstmt.setDouble(3, equipment.getPrice());
       pstmt.setString(4, equipment.getStatus());
       pstmt.setInt(5, equipment.getBuildingId());
       pstmt.setString(6, equipment.getDateAdded());
       
       pstmt.execute();
       
       con.close();
     }
     public void delete (Equipment equipment) throws ClassNotFoundException, SQLException
     {
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
         String sqlStr = "DELETE FROM equipment WHERE equipmentId = (?)";
         PreparedStatement pstmt = con.prepareStatement(sqlStr);
         pstmt.setInt(1, equipment.getId());
         
         pstmt.execute();
         con.close();
     }
  
     
     
//     request section
        public void addRequest(Requests odr) throws ClassNotFoundException, SQLException
    {
        //check for the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //connect to db
        Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        //write to db
        String sqlStr="INSERT INTO ecs.requests (userId,tool,buildingId,status) VALUES((?),(?),(?),'pending')";
        PreparedStatement pstmt=conn.prepareStatement(sqlStr);
        pstmt.setInt(1,odr.getUserId());
        pstmt.setString(2,odr.getToolName());
        pstmt.setInt(3,odr.getBuildingId());
      
        pstmt.execute();
        
        //clos conn
        conn.close();
        

    }
            public void updateRequest(Requests odr) throws ClassNotFoundException, SQLException
    {
        //check for the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //connect to db
        Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
       // System.out.println(odr.getRequestId()+ "----"+odr.getStatus());
        //write to db
        String sqlStr="UPDATE `ecs`.`requests` set requests.status='"+odr.getStatus()+"' where requests.requestId="+odr.getRequestId()+";";
        PreparedStatement pstmt=conn.prepareStatement(sqlStr);
        
      
        pstmt.execute();
        
        //clos conn
        conn.close();
        

    } 
            public ArrayList<Requests> getRequests() throws ClassNotFoundException, SQLException{

      ArrayList<Requests>list=new ArrayList<Requests>();

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);

      String strSQL="";
    
      strSQL="SELECT * FROM ecs.requests;";
      Statement stmt = conn.createStatement();
      ResultSet results = stmt.executeQuery(strSQL);

      while(results.next())
      {

          int requestId =results.getInt(1);
          int userId = results.getInt(2);
          String tool = results.getString(3);
          int buildingId = results.getInt(5);
          String status =results.getString(6);

          Requests row = new Requests(requestId,userId,tool,buildingId,status);
          list.add(row);

      }
      conn.close();

      return list;

  }
             public void enterTransaction(Transactions odr) throws ClassNotFoundException, SQLException
    {
        //check for the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //connect to db
        Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
       // System.out.println(odr.getRequestId()+ "----"+odr.getStatus());
        //write to db
        String sqlStr="insert into  ecs.equipment_transactions (transactionType, equipmentId, userId) VALUE(?,?,?)";
        PreparedStatement pstmt=conn.prepareStatement(sqlStr);
        pstmt.setString(1,odr.getTransactionType());
        pstmt.setInt(2,odr.getEquipmentId());
        pstmt.setInt(3,odr.getUserId());

        
      
        pstmt.execute();
        
        //clos conn
        conn.close();
        

    }
            
            



}