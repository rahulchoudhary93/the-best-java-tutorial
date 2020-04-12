package fundamentals;

public class L2ArithmeticOperators {
	
	// There are 3 types of operators in Java - Basic, Prefix/PostFix, Compound Assignment
	
	public static void main(String [] args) {
		// Basic Operators include +(plus), -(minus) *(multiplication), /(division), %(modulus/remainder)
		int i1 = 7;
		int i2 = 3;
		float f1 = 15.2f;
		float f2 = 3.0f;
		System.out.println(i1+i2); //10
		System.out.println(f1+f2); //18.2
		System.out.println(i1-i2); //4
		System.out.println(f1-f2); //12.2
		System.out.println(i1*i2); //21
		System.out.println(f1*f2); //45.6
		System.out.println(i1/i2); //2
		System.out.println(f1/f2); //5.0666666
		System.out.println(i1%i2); //1
		System.out.println(f1%f2); //0.19999981
		
		// Prefix/Postfix Operators include --(decrement), ++(increment)
		// Prefix applies operation, then returns value
		// Postfix returns value, then applies operation
		System.out.println(--i1); //6
		System.out.println(--f1); //14.2
		System.out.println(++i1); //7
		System.out.println(++f1); //15.2
		System.out.println(i1--); //7
		System.out.println(f1--);  //15.2
		System.out.println(i1++); //6
		
		System.out.println(f1++); //14.2

		// Compound assignment operator include += -= /= *= %=
		int i3 = 13;
		int i4 = 3;
		i3 += i4;
		System.out.println(i3); //16
		i3 -= i4;
		System.out.println(i3); //13
		i3 *= i4;
		System.out.println(i3); //39
		i3 /= i4;
		System.out.println(i3); //13
		i3 %= i4;
		System.out.println(i3); //1
		
	}

}
