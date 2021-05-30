package Math;

import Math.MathOperations;
public class Test {
	
	public static void main(String[] args) {
		MathOperations mo = new MathOperations();
		System.out.println("Addition "+mo.add(1, 2));
		System.out.println("Substractions "+mo.sub(4, 3));
		System.out.println("Multiplication "+mo.mul(4, 5));
		System.out.println("division "+mo.div(4, 2));
	}

}
