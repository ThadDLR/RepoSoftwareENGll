/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick&Tori
 */
public class Requests {
    int requestId = 0;
    int userId = 0;
    String toolName ="";
   int buildingId =0;
   String status="";



    public Requests()
    {
     requestId = 0;
     userId = 0;
     toolName ="";
    buildingId =0;
    status="";
    }
    //validation 
    public Requests(int requestId, int userId,  String toolName, int buildingId, String status) 
    {
        this.requestId = requestId;
        this.userId = userId;
        this.toolName = toolName;
        this.buildingId=buildingId;
        this.status=status;
    }
      public Requests(int userId,  String toolName, int buildingId, String status) 
    {
        this.userId = userId;
        this.toolName = toolName;
        this.buildingId=buildingId;
        this.status=status;
    }
      public Requests(int requestId, String status) 
    {
        this.requestId = requestId;
        this.status=status;
    }
  
    public int getRequestId(){
        return requestId;
    }
    public int getUserId(){
        return userId;
    }
    public String getToolName(){
        return toolName;
    }
       public int getBuildingId(){
        return buildingId;
    }
    public String getStatus(){
        return status;
    }
   
    
}
