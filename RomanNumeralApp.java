import java.util.Scanner;

/**
 * This calculator takes a numeric valule and outputs the roman numeral associated with it
 * @author mmosser
 *
 */

public class RomanNumeralApp {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String inputValue = "";
		int numericValue = 0;
		String continueFlag = "y";

		System.out.println("Welcome to the Roman Numeral Calculator");
		System.out.println();
		
		while (continueFlag.equalsIgnoreCase("y")) {
			
			//get input from user
			System.out.println("Enter an integer: ");
			inputValue = inputScanner.nextLine();
			numericValue = Integer.parseInt(inputValue);
			
			//get the Grade object
			RomanNumeral myRomanNumeral = RomanNumeralDB.getRomanNumeral(numericValue);
			
			//format and display output
			System.out.println("Roman Numeral: " + myRomanNumeral.getRomanNumeral());
			System.out.println();
			
			//ask user if they want to continue
			System.out.println("Continue? (y/n): ");
			continueFlag = inputScanner.nextLine();

		}

	}

}
