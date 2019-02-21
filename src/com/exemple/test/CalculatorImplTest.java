package com.exemple.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.opentest4j.MultipleFailuresError;

import com.exemple.main.Calculator;
import com.exemple.main.CalculatorImpl;

class CalculatorImplTest {

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}
	
	public int getResDivide(int a, int b) {
		return a/b;
	}
	
	@Test
	public final void testDivideByZero() {
		Calculator calc = new CalculatorImpl();
		int a,b,res;
		a = 5;
		b = 1;
		res = a / b;
		assertAll("division par 0",
				() -> assertEquals(res, calc.divide(a, b))
				);
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(a, b);
		});
	}

	@DisplayName("Erreur division")
	@ParameterizedTest(name = "{index} => a={0}, b={1}")
	@CsvSource({
		"1, 1",
		"2, 3"
	})
	public void testDivide(int a, int b) {
		Calculator calc = new CalculatorImpl();
		assertEquals(getResDivide(a,b), calc.divide(a, b));
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
