package fundamentals;

public class L5RelationalOperators {
	/*
	 Relational Operators are: 
	 >(greater than) 
	 <(less than) 
	 >=(greater than or equal to) 
	 <=(less than or equal to) 
	 ==(equal to) 
	 */
	public static void main(String [] args) {
		int var1 = 5, var2 = 7, var3 = 5, var4;
		char var5 = 'a', var6 = 'c';
		System.out.println(var1 > var2); //false
		System.out.println(var1 >= var3); //true
		System.out.println(var5 <= var6); //true - character comparison works with unicode reference
		System.out.println(var5 == var6); //false
		
		// Conditional assignment
		// Syntax | (variable) = (condition) ? (return value if true) : (return value if false)
		var4 = (var1 > var2) ? var1 : var2;
		System.out.println(var4); //7
	}

}
