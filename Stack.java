/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	String[] stack;
	int stackCounter = 0;
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	public Stack(int size) {
		stack = new String[size];
	}
	
	/*
	 * Implement the other methods specified
	 * in the interface below.
	 */
	
	// pushes (adds) element to the top of the stack and returns whether the push was successful
	public boolean push(String record) {
			if (stackCounter < stack.length) {
				stack[stackCounter] = record;
				stackCounter++;
				return true;
			} 
		
		return false;
	}
	
	// pops (removes) an element from the top of the stack and returns the value of the String
	public String pop() {
		String data = "";
		if (stackCounter != 0) {
			stackCounter--;
			data = stack[stackCounter];
			stack[stackCounter] = null;
		}
		return data;
	}
	
	// prints out the stack
	public void printStack() {
		System.out.println("-----------------");
		System.out.println("STACK INFORMATION");
		System.out.println("-----------------");
		for (int i = stackCounter - 1; i >= 0; i--) {
				System.out.println(stack[i]);
		}
	}
	
}
