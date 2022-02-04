package infosys.batch1.demo.commandlinearg;

public class Demo {
	// String[] ---> array of type String
	// args ------> the reference for the string array
	// If we don't pass any arguement from command
	// line , we get  ArrayIndexOutOfBoundException
	// Exceptions are runtime error
	// To pass command line data 
	// Right click on the editor and selection 
	// Run as ===>	Run Configuration==>Arguements===>Command Line arguements
	// How to pass arguement from command line
	// java Demo Ram Shayam 
	// Array is getting created dynamically and
	// size of the array depends on the number of
	// arguements being passed
	// "10" "20" "30" and not as 10 20 30
	public static void main(String[] args) {
     System.out.println(args.length);  //3
	 System.out.println(args[0]);	
	 System.out.println("HEllo");
	 System.out.println(args[1]);
	 System.out.println(args[2]);

	}

}
