/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungry.example;

/**
 *
 * @author Hungry
 */
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class NormalActionListener implements ActionListener{

	@Override
	public void processAction(ActionEvent event)
		throws AbortProcessingException {
		Student stud=(Student) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("student");
                stud.setData("he llo");
                
		
	
	}
	
}