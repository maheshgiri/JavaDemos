/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hungry;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

/**
 *
 * @author Hungry
 */
public class HandleSysEvent implements SystemEventListener {

    
    @Override
    public boolean isListenerForSource(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public void processEvent(SystemEvent se) throws AbortProcessingException {
        if(se instanceof PostConstructApplicationEvent){
            System.out.print("System just started");
        }
    }
    
}
