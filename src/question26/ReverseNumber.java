package question26;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter a number to reverse it: ");
		
		int num = sc.nextInt(), reversed =0;
		
		while (num!=0) {
			int remainder = num%10;
			reversed = reversed * 10 + remainder;
			num /= 10;
			
		}
System.out.println(" Reversed number: " +reversed);
	}

}
