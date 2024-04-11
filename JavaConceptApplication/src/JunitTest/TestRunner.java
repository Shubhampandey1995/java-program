package JunitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		
	Result res	= JUnitCore.runClasses(TestJunitTestCaseExample.class);
	
	for (Failure fail : res.getFailures()) {
		
		System.out.println(fail.toString());
		
	}
	System.out.println(res.wasSuccessful());
		
	/*	 // create a Optional 
		List<Object> list = Arrays.asList("stirng");
		
        Optional<Object> op2  = Optional.ofNullable(list); 
  
        // print value 
        System.out.println("Optional 2: "
                           + op2.isPresent()); */
    } 

	}


