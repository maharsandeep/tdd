package com.sandeep.kata;

public class RomanArabicNumeral {

	private int numeral;
	private String roman;

	public void setArabic(int num) {
		numeral = num;
		if (num < 1 || num > 3999) {
			roman = "NOT-SUPPORTED";
		}
	}
	
	public String getRoman(){
		return roman;
	}

}
