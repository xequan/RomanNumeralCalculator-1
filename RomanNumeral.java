/**
 * 
 * @author mmosser
 *
 */

public class RomanNumeral {

	private int numericValue;
	private String romanNumeral;
	private int ones;
	private int tens;
	private int hundreds;
	private int thousands;
	
public String convertNumberToNumeral(int numericValue){
	String romanOnes = "";
	String romanTens = "";
	String romanHundreds = "";
	String romanThousands = "";
	
	int tempVariable = numericValue;
	ones = tempVariable%10;
	
	tempVariable = numericValue/10;
	tens = tempVariable%10;
	
	tempVariable = numericValue/100;
	hundreds = tempVariable%10;
	
	tempVariable = numericValue/1000;
	thousands = tempVariable%10;
	
	if (ones == 0){
		romanOnes = null;
	} else if (ones == 1){
		romanOnes = "I";
	} else if (ones == 2){
		romanOnes = "II";
	} else if (ones == 3){
		romanOnes = "III";
	} else if (ones == 4){
		romanOnes = "IV";
	} else if (ones == 5){
		romanOnes = "V";
	} else if (ones == 6){
		romanOnes = "VI";
	} else if (ones == 7){
		romanOnes = "VII";
	} else if (ones == 8){
		romanOnes = "VIII";
	} else if (ones == 9){
		romanOnes = "IX";
	}
	
	if (tens == 0){
		romanTens = null;
	} else if (tens == 1){
		romanTens = "XI";
	} else if (tens == 2){
		romanTens = "XII";
	} else if (tens == 3){
		romanTens = "XIII";
	} else if (tens == 4){
		romanTens = "XIV";
	} else if (tens == 5){
		romanTens = "XV";
	} else if (tens == 6){
		romanTens = "XVI";
	} else if (tens == 7){
		romanTens = "XVII";
	} else if (tens == 8){
		romanTens = "XVIII";
	} else if (tens == 9){
		romanTens = "XIX";
	}
	
	return null;
			
}
	
}
