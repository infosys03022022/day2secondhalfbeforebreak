/* Whenever we design a class we have two things:
*  Member variables
*  Member methods
** method naming convention , if a method is with single word , entire word in smallcase.
** method consist of multiple words the first word will be in smallecase, rest of the words
   will have the first character in uppercase and rest of the character in lowercase.
   Same concept goes for variable also. */

  package infosys.day2.demo.classobject;

  public class Employee3 {
    int employeeId;
    int employeeBasic;  // id and basic are member variables of Employee class

  // setData() and displayData() are member methods of Employee class
    void setData(int id, int basic){
      // In the below lines to the member variable we are assigning
    // the value from the method parameters
    	employeeId=id;
      employeeBasic=basic;
      //displayData();  // In this approach setData is calling displayData but not a good prctice
     }
 
    void displayData(){
     System.out.println(employeeId);
     System.out.println(employeeBasic);
     }
  
  }   
         
 