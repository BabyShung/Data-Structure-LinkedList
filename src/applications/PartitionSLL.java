package applications;

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
			
			if (current.getElement() < x) {

				// add the current node to f
				current.setNext(firstListNode);
				firstListNode = current;

			} else {
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
