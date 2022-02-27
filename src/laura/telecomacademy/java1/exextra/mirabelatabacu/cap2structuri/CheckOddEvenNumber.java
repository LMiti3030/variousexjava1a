package laura.telecomacademy.java1.exextra.mirabelatabacu.cap2structuri;

import java.util.Scanner;

public class CheckOddEvenNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Insert a number that you want to verify if it is even or odd: ");
		String read = s.nextLine();
		Double number = 0.0d; 
		try {
			 number = Double.valueOf(read);			 
		}
		catch(NumberFormatException ne) {
			System.out.print(read + " is not a number");
			System.exit(0);
		}
		checkNumber(number);
		s.close();
	}

	private static void checkNumber(Double number) {
		if(number < 0) {
			System.out.println("Number is less than zero");
		}
		else {
			if (number % 2 == 0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd number");
			}
		}
	}

}
