/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxclient5;

/**
 *
 * @author Hailey.Jones
 */
public class closetItem {
    
    public final String username;
    public final String message;
    
    public closetItem(String username, String message){
     
        this.username = username;
        this.message = message;   
    
    }
    
    public String getUsername(){
    return username;
    
    }
    
    public String getMessage(){
    return message;
    
    }
    
    @Override
    public String toString() {
        return (username+ "         " + message) +"";
    }
}
