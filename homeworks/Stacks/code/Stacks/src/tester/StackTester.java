package tester;

import stack.Stack;
import java.util.LinkedList;

public class StackTester {
	
	private static int NUM_TESTS = 1000000;

	public static void main(String[] args) {
		
		try {
			/* Two stacks for comparison */
			stack.Stack<Integer> s1 = new Stack<Integer>();
			LinkedList<Integer> s2 = new LinkedList<Integer>();
			
			System.out.print("Adding items...");
			for(int i=0; i<NUM_TESTS; i++) {
				int toQ = (int)Math.random()*500;
				
				s1.push(toQ);
				s2.push(toQ);
			}
			System.out.println("DONE");
			
			System.out.print("Checking size...");
			if((s1.size() != s2.size())) {
				System.out.println("ERROR: sizes different after adding");
				System.exit(1);
			}
			System.out.println("DONE");
			
			System.out.print("Removing items...");
			for(int i=0; i<NUM_TESTS/2; i++) {
				if(s1.pop() != s2.pop()) {
					System.out.println("ERROR: stack pop() not working, different values removed");
					System.exit(1);
				}
			}
			System.out.println("DONE");
			
			System.out.print("Checking size...");
			if((s1.size() != s2.size())) {
				System.out.println("ERROR: sizes different after enqueueing");
				System.exit(1);
			}
			System.out.println("DONE");
			
			System.out.print("Adding more items...");
			for(int i=0; i<NUM_TESTS; i++) {
				int toQ = (int)Math.random()*500;
				
				s1.push(toQ);
				s2.push(toQ);
			}
			System.out.println("DONE");
			
			System.out.print("Checking size...");
			if(s1.size() != s2.size()) {
				System.out.println("ERROR: sizes different after enqueueing");
				System.exit(1);
			}
			System.out.println("DONE");
			
			System.out.print("Removing everything...");
			while(s2.size() > 0) {
				if(s1.pop() != s2.pop()) {
					System.out.println("ERROR: stack pop() not working, different values removed");
					System.exit(1);
				}
			}
			System.out.println("DONE");
			
			System.out.println("EVERYTHING LOOKS GOOD!");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
