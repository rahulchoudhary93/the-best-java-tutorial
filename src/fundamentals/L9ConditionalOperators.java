package fundamentals;

public class L9ConditionalOperators {
	
	/*
	 There are 2 conditional operators, they execute the right hand side expression only when necessary
	 	1. && (Conditional AND)
	 	2. || (Conditional OR)
	 */
	
	public static void main(String[] args) {
		int budget = 400;
		int packets = 0;
		int perPacketCost;
		
	//	if(packets > 0 & budget/packets > 0) { #Exception in thread "main" java.lang.ArithmeticException: / by zero 
		if(packets > 0 && budget/packets > 0) {	//This doesn't give an error as (packets>0) gives false and the second part of the expression is not executed.
			perPacketCost = budget/packets;
			System.out.printf("Per packet cost %d%n", perPacketCost); //not printed
		}
		else { //else block get's executed as if condition is false
			System.out.printf("Zero packets or Zero budget !"); //printed
		}
	}

}
