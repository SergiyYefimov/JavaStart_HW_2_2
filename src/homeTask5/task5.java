package homeTask5;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int apNumb;
		int acc = 1;
		int fl;
		int i;
		System.out.print("Enter appartment number: ");
		apNumb = input.nextInt();
		if ((apNumb < 0) || (apNumb > 9 * 4 * 4)) {
			System.out.println("Incorrect appartment number!");
			System.exit(911);
		}
		input.close();
		for (i = 1; i <= 4; i++) {
			if ((apNumb > (36 * (i - 1)) && (apNumb <= (36 * i)))) {
				acc = i;
			}
		}
		fl = ((apNumb - 36 * (acc - 1)) / 4);
		if ((fl < 9) && (apNumb % 4 != 0))
			fl++;
		System.out.println("Appartment is in the " + acc + " access on the " + fl + " foor");
	}
}
