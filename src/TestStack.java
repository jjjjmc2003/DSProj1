/**
 * @author fhamid
 * @author your-name-goes-here
 * @date 08/30/2024
 */

public class TestStack {

	public static void main(String[] args) {
		
		Integer x = 0;
		ArrayBasedStack<Integer> myStack = new ArrayBasedStack<Integer>(10, x);
		
		myStack.add(23);
		myStack.add(350);
		myStack.add(900);
		myStack.remove();
		
		System.out.println("Right now, we have " + myStack.currentSize() + " elements in the stack.");		
		myStack.displayMyStackData();
		
		myStack.add(23);
		myStack.remove();
		myStack.add(3500);
		myStack.add(900);
		
		System.out.println("Right now, we have " + myStack.currentSize() + " elements in the stack.");		
		myStack.displayMyStackData();
		
		myStack.add(1123);
		myStack.remove();
		myStack.remove();
		myStack.add(1350);
		myStack.add(10900);
		
		System.out.println("Right now, we have " + myStack.currentSize() + " elements in the stack.");		
		myStack.displayMyStackData();
		
		
		//System.out.println("Stack may contain: " + myStack.allocatedSpace()+ " elements.");
		
		
		
		/*
		 * To-Do 4:
		 * 
		 * Create a new stack that can store Strings. let's call it myStringStack.
		 * Add and remove some Strings to/from myStringStack.
		 * Print the stack elements by calling the displayMyStackData() method.
		 */

		ArrayBasedStack<String> myStringStack = new ArrayBasedStack<String>(11, "");
		myStringStack.add(" Hello\n");
		myStringStack.add("Goodbye\n");
		myStringStack.add("How is your Day?\n");
		myStringStack.add("Go Yankees\n");
		myStringStack.add("Wonderful\n");
		myStringStack.add("Terrible\n");
		myStringStack.add("Saturday\n");
		myStringStack.add("Sundays\n");
		myStringStack.add("Mondays\n");
		myStringStack.add("Tuesdays\n");
		myStringStack.add("Wednesdays\n");
		myStringStack.remove(); //Sucessfully removes "Wednesdays"
		myStringStack.displayMyStackData();
	}

}
