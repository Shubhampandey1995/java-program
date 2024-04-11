package java8Program;

import java.util.Stack;

public class StackExample {
	  public static void main(String[] args) {
	    Stack<Integer> stack = new Stack<>();
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);  // Last-in & First-out
	    
	    
		    Stack<Integer> stack1 = new Stack<>();
		      int s = stack.size();
		      for (int i = 0; i < s; i++) {
			    stack1.push(stack.pop());
			  }
		    
		      System.out.println("======"+stack1);

		     // Last-in & First-out
		   
	    
	 
	    System.out.println(stack);
	    showAndRemoveStackElements(stack);
	  }
	 
	  private static void showAndRemoveStackElements(Stack<Integer> stack) {
	    int size = stack.size();
	    for (int i = 0; i < size; i++) {
	      System.out.print(stack.pop() + " ");
	    }
	  }
	}

