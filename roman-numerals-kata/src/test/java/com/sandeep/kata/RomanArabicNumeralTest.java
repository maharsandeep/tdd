package com.sandeep.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanArabicNumeralTest {
	
	private RomanArabicNumeral ran;
	
	@Before
	public void init(){
		ran = new RomanArabicNumeral();
	}
	
	@Test
	public void checkIfLessThanArabicOneNumbersNotSupported(){
		ran.setArabic(0);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
		ran.setArabic(-1);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
	}
	
	@Test
	public void checkIfGreaterThan3999NumbersNotSupported(){
		ran.setArabic(4000);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
		ran.setArabic(4001);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
	}

}
