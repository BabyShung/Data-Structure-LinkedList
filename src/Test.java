import DoublyLinkedList.ElementNotInListException;
import applications.DeleteDuplicate;
import applications.PalindromeDLL;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		// // Add the following elements to the back or front of the list.
		// sll.addToFront( new Integer( 100 ) );
		// sll.addToFront( new Integer( 50 ) );
		// sll.addToBack( new Integer( 150 ) );
		// sll.addToBack( new Integer( 200 ) );
		// sll.addToFront( new Integer( 0 ) );
		// // What will this print?
		// System.out.println( sll );

		DeleteDuplicate dd = new DeleteDuplicate();
		dd.deleteDuplicate();

		PalindromeDLL<Object> dll = new PalindromeDLL<Object>();
		dll.addToFront(3);
		dll.addToFront(2);
		dll.addToFront(4);
		dll.addToBack(2);
		dll.addToBack(4);
		
		System.out.println(dll);
		System.out.println(dll.checkLinkedListPalindrome());

	}

}
