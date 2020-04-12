package fundamentals;

public class L7VariableScope {
	
	// A variable is accessible only in it own block, which is called the scope of the variable
	
public static void main(String[] args) {
		
		int var1 = 4, var2 = 2;
		
		// if-else if block
		if (var1 > var2) { //Condition satisfied, block executes and further if-else blocks are ignored
			int var4 = 19;
			System.out.println(var4); //19
			System.out.println(var1); //4
		}
		else {  // optional else statement at the end, doesn't execute in this case
		//	System.out.println(var4); // var4 not accessible
			System.out.println(var1); //4
		}
		
	//	System.out.println(var4); // var4 not accessible - [var4 cannot be resolved to a variable]
		System.out.println(var1); //4
	}
}
