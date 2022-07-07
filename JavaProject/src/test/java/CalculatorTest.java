import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CalculatorTest {

	@Test
	void testNullName() {
		Calculator calculator = new Calculator(null);
		Assertions.assertEquals("Standard", calculator.toString(), "Wrong result");			
	}
	@Test
	void testName() {
		Calculator calculator = new Calculator("Name");
		Assertions.assertEquals("Name", calculator.toString(), "Wrong result");			
	}
	
	@Test
	void testPositiveNumber() {
		Calculator calculator = new Calculator(null);
		int result = calculator.add(4, 5);
		Assertions.assertEquals(result, 9);
	}

	@Test
	void testNegativeNumber() {
		Calculator calculator = new Calculator(null);
		try {
			calculator.add(-1, 5);
			fail("Should throw Exception");
		} catch(RuntimeException e) {
			
		}
		
		try {
			calculator.add(5, -1);
			fail("Should throw Exception");
		} catch(RuntimeException e) {
			
		}
	}
	
	@Test
	void testPositiveNumbers2() {
		Calculator calculator = new Calculator(null);
		Assertions.assertEquals("Standard", calculator.toString(), "Wrong result");			
	}
	
	@Test
	void testSubtract() {
        Calculator calculator = new Calculator(null);
        int result = calculator.subtract(5, 4);
        Assertions.assertEquals(result, 1);    
	}
	@Test
	void testWrongDivision() {
		Calculator calculator = new Calculator(null);
		try {
			calculator.division(-1, 0);
		    fail("Should throw Exception");
		} catch(RuntimeException e) {	
		}
			 int result = calculator.division(5, 1);
		     Assertions.assertEquals(result, 5);
	
		}
	@Test
	void testDivision() {
		Calculator calculator = new Calculator(null);
	    int result = calculator.division(5, 5);
	    Assertions.assertEquals(result, 1);  
		}

	@Test
	void testmultiplication() {
        Calculator calculator = new Calculator(null);
        int result = calculator.multiplication(1, 2);
        Assertions.assertEquals(result, 2);    
	}
	
	
}

