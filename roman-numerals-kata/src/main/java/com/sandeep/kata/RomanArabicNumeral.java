package com.sandeep.kata;

public class RomanArabicNumeral {

	private int numeral;
	private String roman;

	public void setArabic(int num) {
		numeral = num;
		setRomanValue(num);
	}

	private void setRomanValue(int num) {
		switch (num) {
		case 1:
			roman = "I";
			break;
		case 5:
			roman = "V";
			break;
		case 10:
			roman = "X";
			break;
		case 50:
			roman = "L";
			break;
		case 100:
			roman = "C";
			break;
		case 500:
			roman = "D";
			break;
		case 1000:
			roman = "M";
			break;
		default:
			roman = "NOT-SUPPORTED";
		}
	}

	public String getRoman() {
		return roman;
	}

}
