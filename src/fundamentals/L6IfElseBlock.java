package fundamentals;

public class L6IfElseBlock {
	
	public static void main(String[] args) {
		
		int var1 = 4, var2 = 2, var3 = 8;
		
		// if statement
		if (var1 < var2)
			System.out.println(var1); //Doesn't execute.
			System.out.println("Done"); //Prints Done. This statement is NOT attached to the if condition hence will print 'Done'.
		
		// nested if statement
		if (var1 > var2)
			if (var2 > 0)
				System.out.println(var1 / var2); //2, this statement is attached to the nearest preceding if statement
		
		// if statement with block
		if (var1 < var2) {
			System.out.println(var1); //Doesn't execute.
			System.out.println("Done"); //Doesn't execute. This statement is NOW attached to the if condition hence will NOT print 'Done'.
		}
		
		// if-else without block
		if (var1 > var2)
			System.out.println(var1); //4
		//	System.out.println(var1); //cannot have this statement here without defining the block by {}
		else
			System.out.println(var2); //Doesn't execute.
		
		// if-else if block
		if (var1 > var2) { //Condition satisfied, block executes and further if-else blocks are ignored
			var1--;
			System.out.println(var1); //3
		}
		else if (var1 < 6) { // Although condition is satisfied, but doesn't execute
			var2--;
			System.out.println(var2);
		}
		else {  //optional else statement at the end, doesn't execute in this case
			var3 += 2;
			System.out.println(var3);
		}
	}
}
