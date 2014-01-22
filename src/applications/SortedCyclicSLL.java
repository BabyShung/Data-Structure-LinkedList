package applications;

/**
 * Question:
 * Given a node from a cyclic sorted linked list, write a method 
 * to insert a value so that it remains sorted, the given node can be any one.
 * 
 * Hint: for cyclic LL, there is no head (in my data structure)
 * so looping throught the list would probably use do{}while; structure
 * See the implementation about scanning through the list.
 * 
 * 
 * 
 */

import CicularSLL.CyclicSLL;
import SinglyLinkedList.SinglyLinkedListNode;

public class SortedCyclicSLL extends CyclicSLL<Integer> {

	public SinglyLinkedListNode<Integer> insert(
			SinglyLinkedListNode<Integer> startNode, Integer ele) {

		// note the node can be anynode in the LL

		// if the list is empty
		if (startNode == null) {
			startNode = new SinglyLinkedListNode<Integer>(ele, startNode);
			return startNode;
		}

		SinglyLinkedListNode<Integer> slow = startNode;
		SinglyLinkedListNode<Integer> fast = slow.getNext();

		do {
			if (fast.getElement() >= ele && slow.getElement() <= ele) {
				break;
			} else if ((fast.getElement() < slow.getElement())
					&& (fast.getElement() > ele || slow.getElement() < ele)) {
				break;
			}
			fast = fast.getNext();
			slow = slow.getNext();

		} while (fast != startNode);

		// add the node
		SinglyLinkedListNode<Integer> newNode = new SinglyLinkedListNode<Integer>(
				ele, slow.getNext());
		slow.setNext(newNode);

		return newNode;

	}
}
