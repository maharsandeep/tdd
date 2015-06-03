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
		numeral = getArabicValue(rom.toUpperCase().charAt(0));
	}

	private int getArabicValue(char letter) {
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
