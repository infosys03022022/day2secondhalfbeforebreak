package infosys.day2.demo.classobject;

public class EmployeeMain4 {

	// In the current program we have two objects
    // one is emp and the other is emp2
    public static void main(String args[]) {
     Employee4 emp=new Employee4(); 
     //emp.setData(1,23000);
    /* we are not able to access the member variables as they are
     * private , so the below commented code will give 
     * compilation error if they are not commented 
     */
     //emp.employeeId=1;
     //emp.employeeBasic=12000;
     
    
     //System.out.println(emp.employeeId);
     //System.out.println(emp.employeeBasic);
     
     
     emp.setData(1,23000);  // storing the id and basic
     emp.displayData(); // displaying the id and basic
     Employee4 emp2=new Employee4();
     // emp.setData(2,40000);
     emp2.setData(2,40000);
     emp2.displayData();
     Employee4 emp3=new Employee4();
     emp3.setData(3,23000);
     emp3.displayData();
     
     }
 

}
