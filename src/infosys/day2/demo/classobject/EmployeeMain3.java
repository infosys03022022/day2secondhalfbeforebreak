package infosys.day2.demo.classobject;

public class EmployeeMain3 {

	  // In the current program we have two objects
    // one is emp and the other is emp2
    public static void main(String args[]) {
     Employee3 emp=new Employee3(); 
     //emp.setData(1,23000);
    // If we are able to access the member variable so then why we
     // should go for methods
     
     emp.employeeId=1;
     emp.employeeBasic=12000;
     
    
     System.out.println(emp.employeeId);
     System.out.println(emp.employeeBasic);
     emp.setData(1,23000);  // storing the id and basic
     emp.displayData(); // displaying the id and basic
     Employee3 emp2=new Employee3();
     // emp.setData(2,40000);
     emp2.setData(2,40000);
     emp2.displayData();
     Employee3 emp3=new Employee3();
     emp3.setData(3,23000);
     emp3.displayData();
     
     }
 

}
