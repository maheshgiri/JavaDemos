package com.hungry.example;
import com.oracle.jrockit.jfr.ValueDefinition;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungry
 */
@ManagedBean(name = "student", eager = true)
@SessionScoped
public class Student {
    String name;
    String country;
    List<String> countryList;
    private String password;
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Student() {
    countryList=new ArrayList<String>();
    countryList.add("India");
    countryList.add("angal");
    countryList.add("Nepal");    
    }

  public void onchangevalue(ValueChangeEvent value){
       country=value.getNewValue().toString();
      
      
  }    
    public List<String> getCountryList() {
        return   countryList;
    }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
  
  public String result(){
      return getData();
  }    
  
  
  public void changeValue(ActionEvent actionevent){
      this.data="newxhtml";
  }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
