package applications;

/**
 * given a SLL and a number x, use x to partition the LL again.
 * The node less than x should appear before x, otherwise after x.
 * 
 * simply to start by loop through the list and form the two partitions and finally merge them 
 * 
 */

import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class PartitionSLL extends SinglyLinkedList<Integer> {

	public void partitionLinkedList(int x) {

		SinglyLinkedListNode<Integer> firstListNode = null;
		SinglyLinkedListNode<Integer> secondListNode = null;
		SinglyLinkedListNode<Integer> current = head.getNext();
		SinglyLinkedListNode<Integer> next = current;

		while (next != null) {

			next = next.getNext();

			if (current.getElement() < x) {// add the current node to first list

				current.setNext(firstListNode);
				firstListNode = current;

			} else {// add the current node to second list
				current.setNext(secondListNode);
				secondListNode = current;
			}
			current = next;
		}

		next = firstListNode;
		while (next.getNext() != null) {
			next = next.getNext();
		}
		next.setNext(secondListNode);
		head.setNext(firstListNode);
	}

}
