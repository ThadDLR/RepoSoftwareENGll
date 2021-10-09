/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick&Tori
 */
public class User {
    String userName = "";
    String password = "";
    int position =0;

    public User()
    {
        userName   ="";
        password = "N/A";
        position   = 0;
   
    }
    //validation 
    public User(String userName, String password, int position) {
        this.userName = userName;
        this.password = password;
        this.position = position;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public int getPosition(){
        return position;
    }
}
