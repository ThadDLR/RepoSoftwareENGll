
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
    private final String PASSWORD = "";//<---add your own DB PW
    //behaviors
    
    //save student object ot db
//    public void add(NewEquipment odr) throws ClassNotFoundException, SQLException
//    {
//        //check for the driver
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        
//        //connect to db
//        Connection conn=DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
//        String insertQuant="INSERT INTO tools (Name,Quantity,Price,Status) VALUES";
//        //System.out.print(insertQuant);
//
//        for(int i=0;i<odr.getQuantity();i++)
//        {
//        insertQuant+="(" +odr.getName()+","+ odr.getQuantity()+","+odr.getToolPrice()+",1.0)";
//        if(i!=(odr.getQuantity()-1)){insertQuant+=",";}
//
//        }
//                        System.out.print(insertQuant);
//
//        
//        //write to db
//        String addToolTypeSQL=insertQuant;
//       PreparedStatement addToolType=conn.prepareStatement(addToolTypeSQL);
//        
//        
////        addToolType.setString(1,odr.getName());
////        addToolType.setDouble(2,odr.getQuantity());
////        addToolType.setDouble(3,odr.getToolPrice());
////        addToolType.setDouble(4,1);
//
//              
//        addToolType.execute();
//        
//        
//        
//        
//        
//        conn.close();
//        
//
//    }
     



}

