/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hungry;

import java.util.Calendar;

/**
 *
 * @author Hungry
 */
public class Todo {
private String id;
  private String title;
  private String description;
  private int priority;
  private Calendar dueDate;
  
  public Todo(String title, String description, int priority){
      this.title = title;
    this.description = description;
    this.priority = priority;
      
  }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
  
  
  
    
    
    
    
}
