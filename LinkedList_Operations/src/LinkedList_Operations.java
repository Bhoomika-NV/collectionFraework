import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Operations {
	public static void main(String[] args) {
		add();// adding the elements
		print();// printing
		delete();// deleting the items
		update();// updates
	   reversing();
	   reversingInternalLogic();
	   containsElement();
	}

	private static void containsElement() {
	     List<Integer> list = new LinkedList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
	      boolean flag= list.contains(9);
	      System.out.println(flag);
	}

	private static void reversingInternalLogic() {
     List<Integer> list = new LinkedList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,1));
     int start=0;
     int end=list.size()-1;
     while(start < end) {
    	 int temp=list.get(start);
    	 list.set(start,list.get(end));
    	 list.set(end,temp); 
    	 start++;
    	 end--;
     }
     System.out.println("reversed = "+ list);
	}

	private static void reversing() {
		List<Integer> linkedlist = new LinkedList<>(Arrays.asList(2, 4, 6, 8, 10, 12));
	 //   ListIterator<Integer> iterator = linkedlist.listIterator();
	    Collections.reverse(linkedlist);
	    System.out.println("reversed list "+linkedlist);
 	}

	private static void update() {
		List<Integer> linkedlist = new LinkedList<>(Arrays.asList(2, 4, 6, 8, 10, 12));
/*    int num = 1; // Start numbering from 1
    for (int i = 0; i < linkedlist.size(); i++) {
         linkedlist.set(i, num++);
     }
*/    
		ListIterator<Integer> listIterator = linkedlist.listIterator();
		int num = 1; // Start numbering from 1
		while (listIterator.hasNext()) {
			listIterator.next(); // Move to the next element
			listIterator.set(num++); // Set the current element and increment num
		}
		System.out.println("updated list"+linkedlist);

	}

	private static void delete() {
		List<Integer> linkedlist = new LinkedList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12));
		Iterator<Integer> iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() > 8) {
				iterator.remove();
			}
		}
		System.out.print("After deleting " + linkedlist + " ");
		System.out.println();
	}

	private static void print() {
		List<Integer> linkedlist = new LinkedList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12));
		Iterator<Integer> i = linkedlist.iterator();
		System.out.print("List is ");
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
	}

	private static void add() {
		List<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(4);
		linkedlist.add(6);
		linkedlist.add(8);
		linkedlist.add(10);
		linkedlist.add(12);
		System.out.println("after adding " + linkedlist + " ");
	}
}
