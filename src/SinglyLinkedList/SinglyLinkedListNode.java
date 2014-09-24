package SinglyLinkedList;

/**
 * 
 * @author haozheng
 */
public class SinglyLinkedListNode<T> {

	private T element;
	private SinglyLinkedListNode<T> next;

	public SinglyLinkedListNode(T elem, SinglyLinkedListNode<T> next) {
		element = elem;
		this.next = next;
	}

	// two getters and two setters, simply enough

	public SinglyLinkedListNode<T> getNext() {
		return next;
	}

	public void setNext(SinglyLinkedListNode<T> nxt) {
		next = nxt;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T elem) {
		element = elem;
	}

	@Override
	public String toString() {
		return "" + getElement();
	}
}
