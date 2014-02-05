package applications;

/**
 * reverse a linkedlist
 * 
 * fundamental* with reverse a sting
 * 
 * 1. Iterative
 * 
 * 
 * 2. Recursive
 * make good use of helper methods!
 * 
 * 
 */

import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class ReverseSLL<T> extends SinglyLinkedList<T> {

	public void reverse() {

		if (head.getNext() == null)// empty
			return;

		SinglyLinkedListNode<T> current, next, loop;
		current = null;
		next = head.getNext();
		head.setNext(null);

		while (next != null) {

			loop = next.getNext();
			next.setNext(current);
			current = next;
			next = loop;
		}
		head.setNext(current);
	}

	
	/**
	 * reverse SLL recursive
	 * 
	 */
	
	public void reverseRec() {

		if (head.getNext() == null)// empty
			return;

		SinglyLinkedListNode<T> newFirst = reverseRec(head.getNext(), null);
		//finally set the headNext
		head.setNext(newFirst);

	}

	private SinglyLinkedListNode<T> reverseRec(SinglyLinkedListNode<T> current,
			SinglyLinkedListNode<T> last) {

		if (current.getNext() == null) {
			current.setNext(last);
			return current;
		}

		SinglyLinkedListNode<T> next = current.getNext();
		current.setNext(last);
		return reverseRec(next, current);
	}

}
