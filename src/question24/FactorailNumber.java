package question24;

import java.util.Scanner;

public class FactorailNumber {

	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number to find the factorial for it");
		int num= sc.nextInt();
		long factorial = 1;
		
		
		for (int i=1; i<=num; i++) {
			factorial=factorial *i;
			
		}
		System.out.println(" the Factorial of number is "+factorial);
	}
}
