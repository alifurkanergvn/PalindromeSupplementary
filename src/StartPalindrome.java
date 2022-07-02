import java.util.Scanner;

public class StartPalindrome {
	
	public static int COUNT=0;
	
	public static String takeWord() {
		Scanner klavyeScanner = new Scanner(System.in);
		System.out.println("Lutfen sorgulanacak veriyi giriniz");
		String input = klavyeScanner.next().toLowerCase();
		klavyeScanner.close();
		return input;
		
	}
	
	public static String palindromeSupplementaryNumber(String input) {
		
		char c = input.charAt(0);
		
		String tempString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			tempString += input.charAt(i);
		}
		
		if (Character.isLetter(c)) {
			 throw new NumberFormatException("Girilen deger 0'dan kucuk veya integer turunde degil.");
		} else if(Character.isDigit(c)){
			
			 if(!tempString.equals(input)){
				++COUNT;
				int inputNumber= Integer.valueOf(input);
				++inputNumber;
				String addedInput= String.valueOf(inputNumber);
				palindromeSupplementaryNumber(addedInput);
				
			}else {
				String countString=String.valueOf(COUNT);
				return countString;
			}
			
		}else {
			String specialCharacter="Lutfen ozel karakter girmeyiniz";
			return specialCharacter;
		}
		String countString=String.valueOf(COUNT);
		return countString;
		
	}
	
}
