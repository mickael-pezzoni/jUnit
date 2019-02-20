package com.exemple.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.exemple.main.Calculator;

class CalculatorImplTest {

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public final void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a,b,res;
		a = 5;
		b = 0;
		res = a / b;
		assertAll("division par 0",
				() -> assertEquals(res, calc.divide(a, b))
				);
		assertThrows(ArithmeticException.class, () -> {
			if(b == 0) {
				throw new ArithmeticException();
			}
		});
	}
	@Test
	public void testDivide() {
		Calculator calc = new CalculatorImpl();
		int a, b, res;
		a = 5; 
		b  = 5; 
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b positif");
		}
		a = 0; 
		b  = 5; 
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a nul");
		}
		a = -5; 
		b  = 5; 
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a negatif");
		}
		a = 5; 
		b  = -5; 
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("b negatif");
		}
		a = -5; 
		b  = -5; 
		res = a / b;
		if (calc.divide(a, b) != res) {
			fail("a et b negatif");
		}
	}

	@Test
	public void testAdd() {
		Calculator addition = new CalculatorImpl();
		int res,a,b = 0;
		a = 5;
		b = 5;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("a & b sont positif");
		}
		a = 0;
		b = 5;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("a est null");
		}
		a = 5;
		b = 0;
		if(addition.add(a, b)!=res) {
			fail("b est null");
		}
		a = -5;
		b = 5;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("a est négatif");
		}
		a = 5;
		b = -5;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("b est négatif");
		}

		a = -5;
		b = -5;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("a & b sont négatif");
		}
		a = 0;
		b = 0;
		res = a + b;
		if(addition.add(a, b)!=res) {
			fail("a & b sont null");
		}
	}

	@Test
	void testSubstract() {
		fail("Not yet implemented");
	}

}
