package fundamentals;

public class L8LogicalOperators {
	
	/*
	 There are four logical operators - 
	 1. & (AND) 
	 2. | (OR)
	 3. ^ (XOR)
	 4. ! (NOT)
	*/
	
	public static void main(String[] args) {
		
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(true & true); //true
		System.out.println(false & false); //false
		
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(true | true); //true
		System.out.println(false | false); //false
		
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); //false
		
		System.out.println(!true); //false
		System.out.println(!false); //true
	}

}
