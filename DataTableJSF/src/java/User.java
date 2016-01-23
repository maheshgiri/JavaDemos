
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import java.util.Arrays;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hungry
 */
@ManagedBean
public class User implements Serializable {
 private String name;
    private String department;
   private int age;
   private double salary;
   private Employee employeev;

    public Employee getEmployeev() {
        return employeev;
    }

    public void setEmployeev(Employee employeev) {
        this.employeev = employeev;
    }
  
   
   
   private static final ArrayList<Employee> employees
      = new ArrayList<Employee>(Arrays.asList(
      new Employee("John", "Marketing", 30,2000.00),
      new Employee("Robert", "Marketing", 35,3000.00),
      new Employee("Mark", "Sales", 25,2500.00),
      new Employee("Chris", "Marketing", 33,2500.00),
      new Employee("Peter", "Customer Care", 20,1500.00)
   ));
   
   
  public ArrayList<Employee> getEmployees() {
      return employees;
   }

    
   public String addEmployee() {		 
      Employee employee = new Employee(name,department,age,salary);
      employees.add(employee);
      return "success";
   }

   public String deleteEmployee(Employee employeev) {
       this.employeev=employeev;
       employees.remove(employeev);		
      
       return null;
   }

   public String editEmployee(Employee employee){
      employee.setCanEdit(true);
      return null;
   }

   public String saveEmployees(){
      //set "canEdit" of all employees to false 
      for (Employee employee : employees){
         employee.setCanEdit(false);
      }		
      return null;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   } 
 
  
    
    
    
}
