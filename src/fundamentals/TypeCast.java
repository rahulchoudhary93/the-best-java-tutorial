package fundamentals;

public class TypeCast {
	/*
	  2 types of Type Casting - Implicit(automatic) and Explicit(using type cast operator)
	  
	  Implicit casting happens during widening conversion
	    e.g., int to float, float to double, int to long 
	  
	  Explicit casting is done during narrowing conversion
	    e.g., float to int, double to float, long to int 
	*/
	
	public static void main(String [] args) {
		
		int val1 = 30;
		float val2 = 43.0f;
		double val3 = 60.0d;
		long val4 = 76;
		
		float result1 = val1; // no error
		float result2 = val1 - val2; // no error
	//	float result3 = val2 - val3; // Type mismatch: cannot convert from double to float
		float result3 = (float) (val1 - val2); // no error *Used type cast operator (float) for narrowing conversion
		System.out.println(result1); //30.0
		System.out.println(result2); //-13.0
		System.out.println(result3); //-13.0
	}

}
