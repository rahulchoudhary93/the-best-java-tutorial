package fundamentals;

/*
	Order of operator precedence in Java - 
	Postfix ( X++, X-- )
	Prefix ( ++X, --X )
	Multiplicative *(multiplication), /(division), %(modulus/remainder)
	Additive  +(plus), -(minus)
	
	Same level precedence - left to right in the expression
	
	The above precedence can be overridden by PARENTHESIS.
	If there are NESTED PARENTHESIS, they are executed INSIDE-OUT.
	
*/

public class OperatorPrecedence {
	
	public static void main(String [] args) {
		
		int val1 = 4;
		int val2 = 2;
		int val3 = 3;
		int val4 = 6;
		
		System.out.println(val1 + val2 - val3 * val4); //-12 ((4 + 2) - (3 * 6))
		System.out.println(val1 - val2 * val3 / val4); //3 (4 - ((2 * 3) / 6))
		System.out.println(val1 - val2 / val3 * val4); //4 (4 - ((2 / 3) * 6))
		System.out.println((++val1) + (val2 - val3) * val4); //-1 (5 + ((2 - 3) * 6))
		System.out.println(val1 + val2 - (val3++) * val4); //-11 ((5 + 2) - (3 * 6))
		
	}
}
