
/**
 *
 * @author Nick&Tori
 */

import java.sql.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
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
    private final String PASSWORD = "Bella6136";//<---add your own DB PW
    //behaviors
    
   // get equipment from database
    public ArrayList<Equipment> getEquipment() throws ClassNotFoundException, SQLException
            {
               ArrayList<Equipment> equipList = new ArrayList<Equipment>();
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               
               Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
               String sqlStr = "SELECT * FROM equipment";
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
            
     public void equipmentCheckOut ( Equipment equipment) throws ClassNotFoundException, SQLException
    {
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



}

