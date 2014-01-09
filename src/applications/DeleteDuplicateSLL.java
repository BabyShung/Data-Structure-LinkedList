package applications;

import java.util.HashMap;
import java.util.Map;
import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class DeleteDuplicateSLL<T> extends SinglyLinkedList<T> {

	private Map<T, Integer> ht;

	public DeleteDuplicateSLL() {

		ht = new HashMap<T, Integer>();
	}

	public void deleteDuplicate() {
		SinglyLinkedListNode<T> prep = getHead();
		for (SinglyLinkedListNode<T> cursor = getHead().getNext(); cursor != null; cursor = cursor
				.getNext()) {
			if (ht.containsKey(cursor.getElement())) {
				prep.setNext(cursor.getNext());
			} else {
				ht.put(cursor.getElement(), 1);
				prep = cursor;
			}
		}

		System.out.println(this);
	}

}
