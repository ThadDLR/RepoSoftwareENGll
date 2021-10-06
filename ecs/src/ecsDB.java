
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






}