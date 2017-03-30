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
public interface MessageStore {
    
    void store(String username, String message);
    void dumpAll();
    
}
