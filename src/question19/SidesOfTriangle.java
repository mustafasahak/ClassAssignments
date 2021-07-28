package question19;

import java.util.Scanner;

public class SidesOfTriangle {

	public static void main(String[] args) {
		int a=0; 
		int b=0; 
		int c=0;
Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the first side of the triangle");

		a = sc.nextInt( );

		System.out.println("Enter the second side of the triangle");

		b= sc.nextInt( );

		System.out.println("Enter the third side of the triangle");

		c=sc.nextInt( );


		if ( (a!=b) && (b!=c) && (c!=a) ) {

		System.out.println (" Scalene triangle ");

		}else if ( (a==b) && (b==c) && (c==a) ) 

			System.out.println ("Equilateral triangle");

		else 
			System.out.println ("Isosceles triangle");


		
	

}
}


