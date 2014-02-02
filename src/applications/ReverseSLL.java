package applications;

/**
 * reverse a linkedlist
 * 
 * fundamental* with reverse a sting
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

}
