package applications;

/**
 * Question:
 * given a SLL,
 * first check if it is cyclic
 * 
 * If so, return the node where the loop starts.
 * 
 * EG:
 * 2 -> 3 -> 6 -> 8 -> 9 -> 3 (the same as the first 3), thus it is cyclic
 * Output should be the node "3".
 * 
 * Hint: Use a fast and slow runner
 * when the two meet, set one back to the LL head.
 * Then the two move at 1 step a time, after k steps they will meet.
 * And that place will be the loop-start.
 * 
 */
import DoublyLinkedList.ElementNotInListException;
import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class CyclicSLL<T> extends SinglyLinkedList<T> {

	public void setCyclic(T element) throws ElementNotInListException {

		SinglyLinkedListNode<T> cursor = head;

		while (cursor.getNext() != null) {
			cursor = cursor.getNext();
		}
		//cursor is the last node in SLL
		//set cursor next to be a node in the list
		cursor.setNext(findNode(element));
	}

	public SinglyLinkedListNode<T> getLoopStart() {

		SinglyLinkedListNode<T> slow = head, fast = head;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();

			if (slow == fast)
				break;
		}

		if (fast == null || fast.getNext() == null)// not cyclic
			return null;

		slow = head;

		while (slow != fast) {
			fast = fast.getNext();
			slow = slow.getNext();
		}

		return fast;
	}

}
