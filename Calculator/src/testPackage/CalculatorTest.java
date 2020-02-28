package testPackage;

import static org.junit.Assert.*;

import org.junit.*;

import goodPackageName.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd_2pos_pos() {

		int x = 20;
		int y = 20;
		int z = Calculator.add(x, y);
		assertTrue(z == 40);

	}

	@Test
	public void testAdd_2neg_neg() {

		int x = -20;
		int y = -20;
		int z = Calculator.add(x, y);

		assertTrue(z == -40);
	}

	@Test
	public void testAdd_oppositSign_zero() {

		int x = -20;
		int y = 20;
		int z = Calculator.add(x, y);
		assertTrue(z == 0);
	}

}
