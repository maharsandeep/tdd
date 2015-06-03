package com.sandeep.kata;

public class RomanArabicNumeral {

	private int numeral;
	private String roman;

	private static int[] numbers = { 1000, 500, 100, 50, 10, 5, 4, 1 };
	private static String[] letters = { "M", "D", "C", "L", "X", "V", "IV", "I" };

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
