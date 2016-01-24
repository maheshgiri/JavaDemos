/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.hungry;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.SystemEvent;

/**
 *
 * @author Hungry
 */

@ManagedBean
public class UserData {
    String data;
    
    public void sysEvent(ComponentSystemEvent sys){
        data="Pre Started app";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
