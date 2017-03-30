/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxclient5;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Hailey.Jones
 */
public class MockMessageClient implements MessageClient{

    @Override
    public String send(String message) {
         try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MockMessageClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return message;

    }
    
    
    
}
