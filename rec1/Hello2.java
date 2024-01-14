package rec1;

public class Hello2 {
	public static void main(String [] args) {
		if (args.length < 2) {
			System.out.println("To run: Hello2 <arg1> <arg2>");
			System.exit(0);
		}				
		
		System.out.println("Hello, " + args[0] +"!");
		System.out.println("Hello, " + args[1] +"!");
		
		System.out.println("Welcome to CS-445!");
	}
}
