package com.sandeep.kata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanArabicNumeralTest {

	private RomanArabicNumeral ran;

	@Before
	public void init() {
		ran = new RomanArabicNumeral();
	}

	@Test
	public void checkIfLessThanArabicOneNumbersNotSupported() {
		ran.setArabic(0);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
		ran.setArabic(-1);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
	}

	@Test
	public void checkIfGreaterThan3999NumbersNotSupported() {
		ran.setArabic(4000);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
		ran.setArabic(4001);
		assertEquals("NOT-SUPPORTED", ran.getRoman());
	}

	@Test
	public void verifyNumeral1() {
		ran.setArabic(1);
		assertEquals("I", ran.getRoman());
	}

	@Test
	public void verifyRoman1() {
		ran.setRoman("I");
		assertEquals(1, ran.getArabic());
	}

	@Test
	public void verifyNumeral5() {
		ran.setArabic(5);
		assertEquals("V", ran.getRoman());
	}

	@Test
	public void verifyRoman5() {
		ran.setRoman("V");
		assertEquals(5, ran.getArabic());
	}

	@Test
	public void verifyNumeral10() {
		ran.setArabic(10);
		assertEquals("X", ran.getRoman());
	}

	@Test
	public void verifyRoman10() {
		ran.setRoman("X");
		assertEquals(10, ran.getArabic());
	}

	@Test
	public void verifyNumeral50() {
		ran.setArabic(50);
		assertEquals("L", ran.getRoman());
	}

	@Test
	public void verifyRoman50() {
		ran.setRoman("L");
		assertEquals(50, ran.getArabic());
	}

	@Test
	public void verifyNumeral100() {
		ran.setArabic(100);
		assertEquals("C", ran.getRoman());
	}

	@Test
	public void verifyRoman100() {
		ran.setRoman("C");
		assertEquals(100, ran.getArabic());
	}

	@Test
	public void verifyNumeral500() {
		ran.setArabic(500);
		assertEquals("D", ran.getRoman());
	}

	@Test
	public void verifyRoman500() {
		ran.setRoman("D");
		assertEquals(500, ran.getArabic());
	}

	@Test
	public void verifyRomanNumberResultsAreCaseInsensitive() {
		ran.setRoman("D");
		assertEquals(500, ran.getArabic());
		ran.setRoman("d");
		assertEquals(500, ran.getArabic());
		

		ran.setRoman("m");
		assertEquals(1000, ran.getArabic());
		ran.setRoman("M");
		assertEquals(1000, ran.getArabic());
	}

	@Test
	public void verifyEmptyOrNullRomanString() {
		ran.setRoman("");
		assertEquals(-1, ran.getArabic());
		ran.setRoman(null);
		assertEquals(-1, ran.getArabic());
		ran.setRoman("    ");
		assertEquals(-1, ran.getArabic());
	}

	@Test
	public void verifyNumeral1000() {
		ran.setArabic(1000);
		assertEquals("M", ran.getRoman());
	}

	@Test
	public void verifyRoman1000() {
		ran.setRoman("M");
		assertEquals(1000, ran.getArabic());
	}

	@Test
	public void verifyNumeral3() {
		ran.setArabic(3);
		assertEquals("III", ran.getRoman());
	}

	@Test
	public void verifyNumeral4() {
		ran.setArabic(4);
		assertEquals("IV", ran.getRoman());
	}

	@Test
	public void verifyNumeral9() {
		ran.setArabic(9);
		assertEquals("IX", ran.getRoman());
	}

	@Test
	public void verifyNumeral40() {
		ran.setArabic(40);
		assertEquals("XL", ran.getRoman());
	}

	@Test
	public void verifyNumeral90() {
		ran.setArabic(90);
		assertEquals("XC", ran.getRoman());
	}

	@Test
	public void verifyNumeral400() {
		ran.setArabic(400);
		assertEquals("CD", ran.getRoman());
	}

	@Test
	public void verifyNumeral900() {
		ran.setArabic(900);
		assertEquals("CM", ran.getRoman());
	}

	@Test
	public void verifyNumeral1066() {
		ran.setArabic(1066);
		assertEquals("MLXVI", ran.getRoman());
	}

	@Test
	public void verifyNumeral1989() {
		ran.setArabic(1989);
		assertEquals("MCMLXXXIX", ran.getRoman());
	}

	@Test
	public void verifyNumeralRandom() {
		ran.setArabic(3456);
		assertEquals("MMMCDLVI", ran.getRoman());
		ran.setArabic(786);
		assertEquals("DCCLXXXVI", ran.getRoman());
		ran.setArabic(2765);
		assertEquals("MMDCCLXV", ran.getRoman());
		ran.setArabic(1234);
		assertEquals("MCCXXXIV", ran.getRoman());
	}

}
