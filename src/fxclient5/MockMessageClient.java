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
public class MockMessageClient implements MessageClient{

    @Override
    public String send(String message) {
         
        return message;

    }
    
    
    
}
