package applications;

/**
 * Question: for a singlyLinkedList, given int k,
 * get the node which is the kth one to last node.
 * 
 * 
 * sol1: set 2 references
 * sol2: recursively scan through the list, set an int,
 * since the return value of each recursion will come back.
 * 
 */

import Exceptions.GeneralException;
import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class KthToLastSLL<T> extends SinglyLinkedList<T> {

	public SinglyLinkedListNode<T> getKthToLastNode(int k)
			throws GeneralException {

		if (k < 0)
			throw new GeneralException("invalid k");

		SinglyLinkedListNode<T> fast = head.getNext();
		SinglyLinkedListNode<T> slow = head.getNext();
		for (int i = 0; i < k; i++) {

			fast = fast.getNext();
			
			if (fast == null)
				throw new GeneralException("k larger than linked list size");
		}

		while (fast.getNext() != null) {
			fast = fast.getNext();
			slow = slow.getNext();
		}
		return slow;

	}
}
