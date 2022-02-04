/* Whenever we design a class we have two things:
*  Member variables
*  Member methods
** method naming convention , if a method is with single word , entire word in smallcase.
** method consist of multiple words the first word will be in smallecase, rest of the words
   will have the first character in uppercase and rest of the character in lowercase.
   Same concept goes for variable also. */

  package infosys.day2.demo.classobject;

  public class Employee {
    int employeeId;
    int employeeBasic;  // id and basic are member variables of Employee class

  // setData() and displayData() are member methods of Employee class
    void setData(){
      employeeId=1;
      employeeBasic=12000;
      //displayData();  // In this approach setData is calling displayData but not a good prctice
     }
 
    void displayData(){
     System.out.println(employeeId);
     System.out.println(employeeBasic);
     }
    // In the current program we have two objects
    // one is emp and the other is emp2
    public static void main(String args[]) {
     Employee emp=new Employee(); 
     emp.setData();  // storing the id and basic
     emp.displayData(); // displaying the id and basic
     Employee emp2=new Employee();
     emp2.setData();
     emp2.displayData();
     }
 
  }   
         
 