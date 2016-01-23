package com.hungry.example;


import com.oracle.jrockit.jfr.ValueDefinition;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungry
 */
@FacesValidator("loginValidator")
public class LoginValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
    String value=(String)o;
    FacesMessage facesMessage = null;
    if(!value.equals("mahesh")){
        facesMessage=new FacesMessage("Please Enter some UserName","Invalidate");
        facesMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
        
    }   
        throw new ValidatorException(facesMessage);
    }
    
}
