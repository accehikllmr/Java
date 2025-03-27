package work;

//Java Program to check if a queue of first n natural number can be sorted using a stack 
import java.io.*; 
import java.util.*; 

public class StackQueueUtility
{ 
	
	/* Function to sort a queue using a stack.  
	 * 
	 * @param q A queue of integers	 
	 */
	public static void sortQueue(Queue<Integer> intQueue) { 
		// instantiating Stack object which contains Integer objects
		Stack<Integer> auxStack = new Stack<Integer>(); 
		
		// iterate until the entire queue has been emptied
		while (!intQueue.isEmpty()) {
			// peek at the first Integer in the queue, store its value (i.e. don't remove it unless it meets conditions)
			Integer head = intQueue.peek();
			// push head of queue to stack if empty or smaller than top element of stack
			if (auxStack.isEmpty() || head <= auxStack.get(auxStack.size() - 1)) {
				// once confirmed that head of queue meets conditions for placement in stack, remove it
				intQueue.remove();
				// add head of queue to stack
				auxStack.push(head);
			} else {
				// loop until head of queue can be added to stack, or stack is empty, whichever comes first
				while(!auxStack.isEmpty() && intQueue.peek() > auxStack.get(auxStack.size() - 1)) {
					// remove top of stack
					Integer top = auxStack.pop();
					// add top of stack to tail of queue, otherwise Integer object will be lost
					intQueue.add(top);
				}
				// head of queue is smaller than top of stack
				head = intQueue.remove();
				// so push it onto top of stack
				auxStack.push(head);
			}
		}
		
		// iterating through stack to add sorted values into the queue, values added in order and need ascending, so reverse order
		for (int i = auxStack.size() - 1; i >= 0; i--) {
			intQueue.add(auxStack.get(i));
		}
	}
	
	
	/* Function to determine if a string determines if parenthesises/brackets in it is balanced.
	 * A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order
	 *  
	 *  @param s input string
	 *  @return if s is balanced 
	 */
	public static boolean isBracketsBalanced(String s) {  
		
		
		return false;
	}

} 

 