/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick&Tori
 */
public class Transactions {

    int transactionId = 0;
    String transactionType ="";
   int equipmentId =0;
   int userId=0;



    public Transactions()
    {
     transactionId = 0;
     userId = 0;
     transactionType ="";
    equipmentId =0;
    }
    //validation 
    public Transactions(int transactionId,  String transactionType, int equipmentId, int userId) 
    {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.equipmentId = equipmentId;
        this.userId=userId;
    }
      public Transactions( String transactionType, int equipmentId, int userId) 
    {
        this.transactionType = transactionType;
        this.equipmentId = equipmentId;
        this.userId=userId;
    }
    
  
    public int getTransactionId(){
        return transactionId;
    }
    public String getTransactionType(){
        return transactionType;
    }
    public int getEquipmentId(){
        return equipmentId;
    }
       public int getUserId(){
        return userId;
    }
  
    


}
