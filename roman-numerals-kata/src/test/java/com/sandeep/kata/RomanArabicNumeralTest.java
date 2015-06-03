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
	
	@Test
	public void verifyNumeral1(){
		ran.setArabic(1);
		assertEquals("I", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral5(){
		ran.setArabic(5);
		assertEquals("V", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral10(){
		ran.setArabic(10);
		assertEquals("X", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral50(){
		ran.setArabic(50);
		assertEquals("L", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral100(){
		ran.setArabic(100);
		assertEquals("C", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral500(){
		ran.setArabic(500);
		assertEquals("D", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral1000(){
		ran.setArabic(1000);
		assertEquals("M", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral3(){
		ran.setArabic(3);
		assertEquals("III", ran.getRoman());		
	}
	
	@Test
	public void verifyNumeral4(){
		ran.setArabic(4);
		assertEquals("IV", ran.getRoman());		
	}
}
