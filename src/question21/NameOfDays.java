package question21;

import java.util.Scanner;

public class NameOfDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the numbers between 1 and 7: ");
		int days = sc.nextInt();

		switch (days) {
		case 1:

			System.out.print("Happy Monday is ");
			break;
		case 2:

			System.out.print("Welcome Tuesday!!! ");
			break;
		case 3:

			System.out.print("Wedneday is the Middle of the week is ");
			break;
		case 4:
			System.out.print("Thursday is a beautiful day ");
			break;
		case 5:

			System.out.print("This is Friday- My favorite day of the week ");
			break;
		case 6:

			System.out.print("Saturday is family day for me");
			break;
		case 7:

			System.out.print("Sunday is my relaxation day");
			break;
		default:
			System.out.println("Invalid day range.");
		}
		System.out.println(" \nHave good rest of the week.");
	}
}
