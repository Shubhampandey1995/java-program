package ExceptionHandling;

class Parent{
	
	void msg() throws Exception {
		System.out.println("parent method");
	}
}

public class TestExceptionChildWithMethodOveriding extends Parent {
	
	void msg() throws Exception {
		
	    System.out.println("TestExceptionChild method");    

	}
	
	public static void main (String[] args) {
		
		Parent p = new TestExceptionChildWithMethodOveriding();
		
		try {
			
		p.msg();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
