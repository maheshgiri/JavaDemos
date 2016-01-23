package com.hungry.example;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungry
 */
@ManagedBean

public class Student {
    String name;
    String country;
    List<String> countryList;
    private String password;

    public Student() {
    countryList=new ArrayList<String>();
    countryList.add("India");
    countryList.add("angal");
    countryList.add("Nepal");    
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
  
  
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
}
