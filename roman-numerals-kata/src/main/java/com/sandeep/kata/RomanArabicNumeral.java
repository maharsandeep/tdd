package com.sandeep.kata;

public class RomanArabicNumeral {

	private int numeral;
	private String roman;

	public void setArabic(int num) {
		numeral = num;
		if (num < 1 || num > 3999) {
			roman = "NOT-SUPPORTED";
		} else if (num == 1) {
			roman = "I";
		} else if (num == 5) {
			roman = "V";
		} else if (num == 10) {
			roman = "X";
		}
	}

	public String getRoman() {
		return roman;
	}

}
