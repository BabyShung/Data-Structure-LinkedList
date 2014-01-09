import DoublyLinkedList.ElementNotInListException;
import applications.DeleteDuplicateSLL;
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

		DeleteDuplicateSLL<Object> dd = new DeleteDuplicateSLL<Object>();
		dd.addToFront( 100 );
		dd.addToFront( 50);
		dd.addToBack( 150);
		dd.addToBack( 200);
		dd.addToFront(0 );
		dd.addToFront( 0);
		dd.addToFront(100 );
		System.out.println(dd);
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
