import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class scientificCalcOperationsTest {
	ScientificCalcOperations scientificCalcOperations= new ScientificCalcOperations();
//	@Test
	//void test() {
	//	fail("Not yet implemented");
//	}
	
	@Test
	void test_addition() {
		double result = scientificCalcOperations.addition(12.0, 15.0);
		assertEquals(27.0, result);
	}
	
	@Test
	void test_subtraction() {
		double result = scientificCalcOperations.subtraction(25.0, 6.0);
		assertEquals(19.0, result);
	}
	
	@Test
	void test_multiply() {
		double result = scientificCalcOperations.multiply(3.0, 5.0);
		assertEquals(15.0, result);
	}
	
	@Test
	void test_modulo() {
		double result = scientificCalcOperations.modulo(10.0, 2.0);
		assertEquals(0.00, result);
	}
		
	@Test
	void test_divide() {
		double result = scientificCalcOperations.divide(100.0, 10.0);
		assertEquals(10.0, result);
	}
	
	@Test
	void test_divide1() {
		double result = scientificCalcOperations.divide(0.0, 80.0);
		assertEquals(0, result);
	}
		
	@Test
	void test_squareRoot9() {
		double result = scientificCalcOperations.squareRoot(9.0);
		assertEquals(3.0, result);
	}
	
	@Test
	void test_squareRoot5() {
		double result = scientificCalcOperations.squareRoot(5.0);
		assertEquals(2.23606797749979, result);
	}
	
	@Test
	void test_log10() {
		double result = scientificCalcOperations.log10(100.0);
		assertEquals(2.0,  result);
	}
	
	@Test
	void test_sin() {
		double result = scientificCalcOperations.sin(100.0);
		assertEquals(-0.5063656411097588,  result);
	}
	

}