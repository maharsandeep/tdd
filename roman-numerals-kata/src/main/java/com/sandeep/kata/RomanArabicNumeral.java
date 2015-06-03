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
			setRomanValue(num);
		}
	}

	private void setRomanValue(int num) {
		roman = "";
		int N = num;
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
	}

	public String getRoman() {
		return roman;
	}

}
