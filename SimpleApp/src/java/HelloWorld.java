
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungry
 */
@ManagedBean(name="hello",eager=true)
@RequestScoped
public class HelloWorld {
    @ManagedProperty(value="#{message}")
private Message messageBean;

    private String message;    
    
    public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
   public String getMessage() {
       if(messageBean!=null){
           messageBean.getMessage();
       }
       
      return message;
   }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }
   
}
