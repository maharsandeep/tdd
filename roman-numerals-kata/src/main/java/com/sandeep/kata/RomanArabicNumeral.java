package com.sandeep.kata;

public class RomanArabicNumeral {

	private int numeral;
	private String roman;

	private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public void setArabic(int num) {
		numeral = num;
		if (num < 1 || num > 3999) {
			roman = "NOT-SUPPORTED";
		} else {
			calculateRomanValue(num);
		}
	}

	private void calculateRomanValue(int num) {
		roman = "";
		int N = num;
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
	}

	public void setRoman(String rom) {
		roman = rom;
		if (rom == null || "".equalsIgnoreCase(rom.trim()) || rom.length() < 1) {
			numeral = -1;
		} else {
			numeral = getArabicValue(rom.toUpperCase());
		}
	}

	private int getArabicValue(String rom) {
		int i = 0;
		int arabic = 0;

		while (i < rom.length()) {
			char letter = rom.charAt(i);
			int number = getArabicValueForRomanLetter(letter);
			if (number < 0)
				return -1;

			i++; 
			
			if (i == rom.length()) {
				arabic += number;
			}
		} 

		if (arabic > 3999)
			arabic = -1;

		return arabic;

	}

	private int getArabicValueForRomanLetter(char letter) {
		switch (letter) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	public String getRoman() {
		return roman;
	}

	public int getArabic() {
		return numeral;
	}

}
