
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxclient5;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hailey.Jones
 */
public class SimpleMessageStore implements MessageStore {

    Map<closetItem, LocalDateTime> closet = new HashMap<>();
    
    
    //ADD ITEM
    //am i right to assume each message will be printed?
    
    
    @Override
    public void store(String username, String message) {
        
        closetItem item = new closetItem(username, message);
        
        
        LocalDateTime time = LocalDateTime.now();
        closet.put(item, time);
            
                   
}

    @Override
    public void dumpAll() {
        
        Set<closetItem> setOfInventoryItems = closet.keySet();
    System.out.println("**Message Dump Report**");
        System.out.println("Date                      From            Message");
        for(closetItem item : setOfInventoryItems){
        System.out.println(item + "" + closet.get(item));
        }
}
   
        
         
}
