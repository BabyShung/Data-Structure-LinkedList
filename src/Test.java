import DoublyLinkedList.ElementNotInListException;
import Exceptions.GeneralException;
import applications.CyclicSLL;
import applications.KthToLastSLL;
import applications.PartitionSLL;

public class Test {

	/**
	 * @param args
	 * @throws GeneralException 
	 * @throws ElementNotInListException 
	 */
	public static void main(String[] args) throws GeneralException, ElementNotInListException {
		// SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		// // Add the following elements to the back or front of the list.
		// sll.addToFront( new Integer( 100 ) );
		// sll.addToFront( new Integer( 50 ) );
		// sll.addToBack( new Integer( 150 ) );
		// sll.addToBack( new Integer( 200 ) );
		// sll.addToFront( new Integer( 0 ) );
		// // What will this print?
		// System.out.println( sll );

//		DeleteDuplicateSLL<Object> dd = new DeleteDuplicateSLL<Object>();
//		dd.addToFront( 100 );
//		dd.addToFront( 50);
//		dd.addToBack( 150);
//		dd.addToBack( 200);
//		dd.addToFront(0 );
//		dd.addToFront( 0);
//		dd.addToFront(100 );
//		System.out.println(dd);
//		dd.deleteDuplicate();
//
//		
//		
//		
//		
//		
//		PalindromeDLL<Object> dll = new PalindromeDLL<Object>();
//		dll.addToFront(3);
//		dll.addToFront(2);
//		dll.addToFront(4);
//		dll.addToBack(2);
//		dll.addToBack(4);
//		
//		System.out.println(dll);
//		System.out.println(dll.checkLinkedListPalindrome());
		
		
//		PartitionSLL psll = new PartitionSLL();
//		psll.addToFront(3);
//		psll.addToFront(2);
//		psll.addToFront(4);
//		psll.addToBack(7);
//		psll.addToBack(6);
//		psll.addToBack(1);
//		psll.addToBack(5);
//		System.out.println(psll);
//		psll.partitionLinkedList(5);
//		System.out.println(psll);

		
//		KthToLastSLL<Object> klsll = new KthToLastSLL<Object>();
//		klsll.addToFront(3);
//		klsll.addToFront(4);
//		klsll.addToFront(5);
//		klsll.addToFront(1);
//		klsll.addToFront(7);
//		System.out.println(klsll);
//		System.out.println(klsll.getKthToLastNode(4));
		
		
		CyclicSLL<Object> csll = new CyclicSLL<>();
		csll.addToFront(3);
		csll.addToFront(4);
		csll.addToFront(5);
		csll.addToFront(1);
		csll.addToFront(7);
		csll.addToFront(2);
		csll.addToFront(9);
		csll.addToFront(10);
		csll.addToFront(11);
		csll.addToFront(21);
		csll.addToFront(80);
		
		System.out.println(csll);
		csll.setCyclic(2);
		System.out.println(csll.getLoopStart());
	}

}
