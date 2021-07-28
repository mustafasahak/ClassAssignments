package question18;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a= sc.nextInt();
		
		System.out.println("Enter a second number");
		int b= sc.nextInt();
		
		System.out.println("Enter a third number");
		int c= sc.nextInt();

		if (c > b && c > a) {
			System.out.println(c+ " is greater");
		}
		if (b > a && b > c) {
			System.out.println(b+ " is greater");
		}
		if (a > c && a > b) {
			System.out.println(a+ " is greater");

		}

	}
}
