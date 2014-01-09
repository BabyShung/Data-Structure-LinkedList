package applications;

import DoublyLinkedList.DoublyLinkedList;
import DoublyLinkedList.DoublyLinkedListNode;

public class PalindromeDLL<T> extends DoublyLinkedList<T> {

	public boolean checkLinkedListPalindrome() {
		DoublyLinkedListNode<T> fast = this.getHead().getNext();

		DoublyLinkedListNode<T> front = this.getHead().getNext();
		DoublyLinkedListNode<T> back = this.getTail().getPrev();

		while (fast != getTail() && fast.getNext() != getTail()) {

			if (front.getElement() == back.getElement()) {
				fast = fast.getNext().getNext();
				front = front.getNext();
				back = back.getPrev();
			}else{
				return false;
			}
		}
		return true;
	}

}
