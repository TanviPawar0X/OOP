import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		
		for(int i=0 ; i < 10 ; i++) {
			myStack.push(i+1);		
		}
		System.out.println(myStack);
		
//		myStack.forEach((i)->System.out.println(i));
		
		for(int i=0 ; i < myStack.size() ; i++) {
			Integer pullOutGuy = myStack.pop();
			System.out.println(pullOutGuy);
		}
		
			System.out.println(myStack.peek());//displays last added elements
			
			
			
			
		}
	}


