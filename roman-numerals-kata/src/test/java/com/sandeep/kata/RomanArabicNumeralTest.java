package com.sandeep.kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class RomanArabicNumeralTest {
	
	@Test
	public void checkIfLessThanArabicOneNumbersNotSupported(){
		RomanArabicNumeral ran = new RomanArabicNumeral();
		ran.setArabic(0);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
		ran.setArabic(-1);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
	}

}
