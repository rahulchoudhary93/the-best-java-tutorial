package fundamentals;

public class L1Variable {
	
	// Variables can have letter, number, $ or _ by rule, but only letter and number by convention
	// variable name should start with only letter as per convention(letter or number as per rule
	// By convention the naming should follow camel case
	
	// There are 4 primitive data types in Java - Integer, Floating Point, Character and Boolean
	// The primitive data types are copied by value in Java, i.e., when a variable is assigned.. 
	//..to another variable, there are two separate copies in memory and only the value of one..
	//..is assigned to the other
	
	public static void main(String [] args) {
		int myVar = 10;      // compile time error if not initialized
		System.out.println(myVar);
		int newVar = 20;
		myVar = newVar; // Copy by value
		newVar = 30;
		System.out.println(myVar);
		System.out.println(newVar);
		
		// Integer Types - byte, short, int, long
		byte by = -127;  // -128 to 127 (8 bits)
		short s = 32767; // -32768 to 32767 (16 bits)
		int i = 2147483647; // -2147483648 to 2147483647 (32 bits)
		long l = 21474836478888888L; // to be suffixed by L (64 bits)
		
		// Floating Point data types - float, double
		float f = 26.3f;
		double d = 26.8d;
		
		// Character and Boolean
		char c = 'U';
		char u = '\uD00A'; // U with accent
		boolean bo = true;
		
	}

}
