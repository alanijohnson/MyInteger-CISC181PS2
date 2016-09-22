package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	@Test
	public void test_MyInteger(){
		MyInteger myint1 = new MyInteger(12);
		MyInteger myint2 = new MyInteger(13);
		assertEquals(myint1.isEven(),true);
		assertEquals(myint2.isEven(),false);
		assertEquals(myint2.isOdd(),true);
		assertEquals(myint1.isOdd(),false);
		assertEquals(myint1.isPrime(),false);
		assertEquals(myint2.isPrime(),true);
		assertEquals(MyInteger.isEven(2),true);
		assertEquals(MyInteger.isEven(3),false);
		assertEquals(MyInteger.isOdd(myint1.getiValue()),false);
		assertEquals(MyInteger.isOdd(myint2.getiValue()),true);
		assertEquals(MyInteger.isPrime(myint2.getiValue()),true);
		assertEquals(MyInteger.isPrime(myint1.getiValue()),false);
		assertEquals(MyInteger.isEven(myint1),true);
		assertEquals(MyInteger.isEven(myint2),false);
		assertEquals(MyInteger.isOdd(myint1),false);
		assertEquals(MyInteger.isOdd(myint2),true);
		assertEquals(MyInteger.isPrime(myint2),true);
		assertEquals(MyInteger.isPrime(myint1),false);
		assertEquals(myint1.isEquals(5),false);
		assertEquals(myint1.isEquals(12),true);
		assertEquals(myint1.isEquals(new MyInteger(12)),true);
		assertEquals(myint1.isEquals(new MyInteger(13)),false);
	}
	
	
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

}
