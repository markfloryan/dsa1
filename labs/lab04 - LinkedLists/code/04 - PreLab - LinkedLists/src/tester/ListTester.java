package tester;

import java.util.LinkedList;
import list.*;

/**
 * @author Mark Floryan
 * @version 1.0
 * This class tests a custom built linked list by comparing it with java built in Linked List
 */
public class ListTester {
	
	private static <T> boolean compareLists(java.util.LinkedList<T> list1, list.LinkedList<T> list2) {
		if(list1.size() != list2.size()) return false;
		
		/* Note, this is slow because each .get() call needs to traverse from beginning of each list */
		for(int i=0; i<list1.size(); i++) {
			if(!(list1.get(i).equals(list2.get(i)))) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		/* Test the two lists by inserting and removing stuff and checking equality as we go */
		
		/* A list to compare with for correctness */
		java.util.LinkedList<Integer> compList = new LinkedList<Integer>();
		
		/* The custom list built by the student */
		list.LinkedList<Integer> studList = new list.LinkedList<Integer>();
		
		/* Insert a bunch of random integers into the list */
		System.out.print("Checking inserting at tail of list...");
		for(int i=0; i<500; i++) {
			int rand = (int)Math.floor(Math.random()*1000);
			compList.add(rand);
			studList.insertAtTail(rand);
			if(!compareLists(compList, studList)) {
				System.out.println("ERROR: Inserting at tail failed OR .get() failed (when comparing)");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		/* Insert a bunch of things at the head */
		System.out.print("Checking inserting at head of list...");
		for(int i=0; i<500; i++) {
			int rand = (int)Math.floor(Math.random()*1000);
			compList.addFirst(rand);
			studList.insertAtHead(rand);
			if(!compareLists(compList, studList)) {
				System.out.println("ERROR: Inserting at head failed");
				System.out.println(compList);
				System.out.println(studList);
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		/* remove some things */
		System.out.print("Checking remove at tail...");
		for(int i=0; i<500; i++) {
			compList.removeLast();
			studList.removeAtTail();
			
			if(!compareLists(compList, studList)) {
				System.out.println("ERROR: removing from the tail failed.");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		System.out.print("Checking remove at head...");
		for(int i=0; i<500; i++) {
			compList.removeFirst();
			studList.removeAtHead();

			if(!compareLists(compList, studList)) {
				System.out.println("ERROR: removing from the head failed.");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		/*Call the generic insertAt() method a bunch of times*/
		System.out.print("Checking inserting at generic index of list...");
		for(int i=0; i<500; i++) {
			int rand = (int)Math.floor(Math.random()*10);
			int ind = (int)(Math.random()*compList.size());
			compList.add(ind, rand);
			studList.insertAt(ind, rand);
			if(!compareLists(compList, studList)) {
				System.out.println("ERROR: Inserting at generic index (i.e, insertAt()) failed");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		/*Check the find method*/
		System.out.print("Checking find in the list...");
		for(int i=0; i<500; i++) {
			int rand = (int)Math.floor(Math.random()*10);

			int ind1 = compList.indexOf(rand);
			int ind2 = studList.find(rand);
			if(!(ind1 == ind2)) {
				System.out.println("ERROR: find() method failed");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");

		/*Check the get method*/
		System.out.print("Checking get in the list...");
		for(int i=0; i<500; i++) {
			int rand = (int)Math.floor(Math.random()*compList.size());

			int ind1 = compList.get(rand);
			int ind2 = studList.get(rand);
			if(!(ind1 == ind2)) {
				System.out.println("ERROR: get() method failed");
				System.exit(1);
			}
		}
		System.out.println("Done. Looks good");
		
		/* Clear the list */
		System.out.print("Checking clearing the list...");
		compList.clear();
		studList.clear();
		if(!(compareLists(compList, studList))) {
			System.out.println("ERROR: clearing the list failed");
			System.exit(1);
		}
		System.out.println("DONE");
		
		System.out.println("EVERYTHING LOOKS GOOD!!");
	}

}
