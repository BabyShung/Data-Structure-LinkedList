package SinglyLinkedList;

import DoublyLinkedList.ElementNotInListException;

/**
 *
 * @author haozheng
 * 
 *         this LL only has a head, not tail
 * 
 *         DLL and firstlastLL has both head and tail
 */
public class SinglyLinkedList<T> {
	protected SinglyLinkedListNode<T> head;

	public SinglyLinkedList(T element) {
		head = new SinglyLinkedListNode<T>(null, new SinglyLinkedListNode<T>(
				element, null));
	}

	// empty LL with just the head
	public SinglyLinkedList() {
		head = new SinglyLinkedListNode<T>(null, null);
	}

	public void addToFront(T element) {
		SinglyLinkedListNode<T> newHead = new SinglyLinkedListNode<T>(element,
				head.getNext());
		head.setNext(newHead);
	}

	public void addToBack(T element) {
		SinglyLinkedListNode<T> cursor = head;
		while (cursor.getNext() != null) {
			cursor = cursor.getNext();
		}
		cursor.setNext(new SinglyLinkedListNode<T>(element, null));
	}

	public SinglyLinkedListNode<T> getHead() {
		return head;
	}

	// helper
	protected SinglyLinkedListNode<T> findNode(T elem)
			throws ElementNotInListException {

		SinglyLinkedListNode<T> cursor = head.getNext();

		while (cursor != null && !cursor.getElement().equals(elem)) {
			cursor = cursor.getNext();
		}

		if (cursor == null) {
			throw new ElementNotInListException("Element " + elem
					+ " not in list.");
		}
		return cursor;
	}

	@Override
	public String toString() {
		String listString = "HEAD -> ";

		for (SinglyLinkedListNode<T> cursor = head.getNext(); cursor != null; cursor = cursor
				.getNext()) {
			listString += cursor.toString() + " -> ";
		}

		return listString + "END-OF-LIST";
	}
}