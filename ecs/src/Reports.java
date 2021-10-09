/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick&Tori
 */
public class Reports {
    int transactionID =0;
    String transactionType = "";
    String equipmentName = "";
    double price =0;
    String name = "";
    int userID =0;
    int contingency=0;
    int equipmentId=0;
    String dateAdded="";
    String buildingName="";
    public Reports()
    {
        transactionID   =0;
        transactionType = "N/A";
        equipmentName   = "N/A";
        price           =0.0;
        name            = "N/A";
        userID          =0;
        contingency     =0;
        equipmentId     =0;
        dateAdded       ="";
        buildingName    ="";

    }
    //contingency 
    public Reports(int transactionID, String transactionType, String equipmentName, double price, String name,int userID) {
        this.transactionID = transactionID;
        this.transactionType = transactionType;
        this.equipmentName = equipmentName;
        this.price = price;
        this.name = name;
        this.userID = userID;
    }
    // user contingency
    public Reports( String name, int userID, int contingency) {
       
        this.name = name;
        this.userID = userID;
        this.contingency = contingency;
    }
    public Reports( int equipmentId, String equipmentName, Double price, String dateAdded, String buildingName) {
       
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.price = price;
        this.dateAdded = dateAdded;
        this.buildingName = buildingName;     
    }
    
    public int getTransactionID(){
        return transactionID;
    }
    public String getTransactionType(){
        return transactionType;
    }
    public String getEquipmentName(){
        return equipmentName;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public int getUserID(){
        return userID;
    }
    public int getCntingency(){
        return contingency;
    }
    public int getEquipmentId(){
        return equipmentId;
    }
    public String getDateAdded(){
        return dateAdded;
    }
    public String getBuildingName(){
        return buildingName;
    }
//      int equipmentId=0;
//    String dateAdded="";
//    String buildingName="";
//    
}
