package CicularSLL;

import DoublyLinkedList.ElementNotInListException;
import SinglyLinkedList.SinglyLinkedListNode;

public class CyclicSLL<T> {

	protected SinglyLinkedListNode<T> headEle;

	public CyclicSLL(T element) {
		headEle = new SinglyLinkedListNode<T>(element, null);
		headEle.setNext(headEle);
	}

	public CyclicSLL() {
	}

	public SinglyLinkedListNode<T> getHead() {
		return headEle;
	}

	public void addToBack(T element) {
		if (headEle == null) {
			headEle = new SinglyLinkedListNode<T>(element, null);
			headEle.setNext(headEle);
			return;
		}

		SinglyLinkedListNode<T> cursor = headEle;

		do {
			cursor = cursor.getNext();
		} while (cursor.getNext() != headEle);

		cursor.setNext(new SinglyLinkedListNode<T>(element, headEle));
	}

	protected SinglyLinkedListNode<T> findNode(T elem)
			throws ElementNotInListException {

		SinglyLinkedListNode<T> cursor = headEle;

		do {
			if (cursor.getElement() == elem)
				break;
			cursor = cursor.getNext();
		} while (cursor != headEle);

		if (cursor == headEle) {
			throw new ElementNotInListException("Element " + elem
					+ " not in list.");
		}
		return cursor;
	}

	@Override
	public String toString() {
		String listString = "";

		if (headEle == null)
			return "Empty Linked List.";

		SinglyLinkedListNode<T> cursor = headEle;
		do {
			listString += cursor.toString() + " -> ";
			cursor = cursor.getNext();
		} while (cursor != headEle);

		return listString + "(back to first)";
	}
}
