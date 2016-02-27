package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		
	}
	
	@Test
	public void isEven() {
		int TestValue = 8;
		MyInteger testcase = new MyInteger(TestValue);
		boolean Expectedresult = true;
		boolean Actualresult = testcase.isEven();
		assertEquals("isEven fails", Actualresult, Expectedresult);
	}
	
	public void isOdd() {
		int TestValue = 5;
		MyInteger testcase = new MyInteger(TestValue);
		boolean Expectedresult = true;
		boolean Actualresult = testcase.isOdd();
		assertEquals("isOdd fails", Actualresult, Expectedresult);
	}
	
	public void isPrime() {
		int TestValue = 7;
		MyInteger testcase = new MyInteger(TestValue);
		boolean Expectedresult = true;
		boolean Actualresult = testcase.isPrime();
		assertEquals("isPrime fails", Actualresult, Expectedresult);
	}
	
	public void equals() {
		int TestValue = 13;
		MyInteger testcase = new MyInteger(TestValue);
		boolean Expectedresult = true;
		boolean Actualresult = testcase.equals(13);
	}
}
