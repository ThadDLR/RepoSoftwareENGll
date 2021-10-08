/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Equipment {
    private int         equipmentId;
    private String      equipmentName;
    private double      price;
    private String      status;
    private int         buildingId;
    private String      dateAdded;   

    
    //constructs
    public Equipment()
    {
        equipmentId     =0;
        equipmentName   = "N/A";
        price           =0.0;
        status          = "N/A";
        buildingId      =0;
        dateAdded       = "N/A";         
    }

    public Equipment(int equipmentId, String equipmentName, double price, String
            status, int buildingId, String dateAdded) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.price = price;
        this.status = status;
        this.buildingId = buildingId;
        this.dateAdded = dateAdded;
    }

    //Behaviours
 
    //@Override

    //Getters and Setters

    public int getId() {
        return equipmentId;
    }

    public void setId(int equipmentId) {
        this.equipmentId = equipmentId;
    }
    public String getName() {
        return equipmentName;
    }

    public void setName(String equipmentName) {
        this.equipmentName = equipmentName;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
     public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }
     public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
   
    
}


  