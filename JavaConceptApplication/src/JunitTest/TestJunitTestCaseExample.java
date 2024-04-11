package JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestJunitTestCaseExample {

	JunitTestCaseExample obj = new JunitTestCaseExample();
	
	@Test
	@DisplayName("adding 3 student to object")
	public void add() {
		
		obj.add("Vivek");
		obj.add("Jaydeep");
		obj.add("Shubham");
		
		assertEquals(3, obj.sizeOfStudent());
		
	}
	@Test
	public void remove() {
		
		obj.add("Vivek");
		obj.add("Jaydeep");
		obj.remove("Vivek");
		assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());
		
	}
	
	@Test
	public void removeAll() {
		
		obj.removeAll();
	}
	
	@Test 
	public void checkNumTest() {
	    int num1 = 20;
	    assertTrue("Number is not equal to 0", num1!=0);
	}
	@Test 
	public void checkNummTest() {
	    int num1 = 20;
	    assertFalse("Number is not greater than 0",num1>0);
	}
	
}
