package SimplfiedDLL;

/**
 * APIs:
 * 
 * 1.addToFront
 * 
 * 2.addToBack
 * 
 * 3.deleteNode
 * 
 * 4.(HELPER) findNode
 * 
 * 5.insertBefore
 * 
 * 
 * @author haozheng
 *
 */

public class DLL {

	protected DLLN head;
	protected DLLN tail;

	public DLL() {
		head = new DLLN(-1, null, null);
		tail = new DLLN(-1, null, null);
		head.setNext(tail);
		tail.setPrev(head);
	}

	public void addToFront(int val) {
		DLLN node = new DLLN(val, head, head.getNext());
		node.getPrev().setNext(node);
		node.getNext().setPrev(node);
	}

	public void addToBack(int val) {
		DLLN node = new DLLN(val, tail.getPrev(), tail);
		node.getPrev().setNext(node);
		node.getNext().setPrev(node);
	}

	protected DLLN findNode(int val) {
		DLLN cur = head.getNext();
		while (cur != null && cur.getVal() != val) {
			cur = cur.getNext();
		}
		return cur;
	}

	public DLLN deleteNode(int val) {
		DLLN delete = findNode(val);
		delete.getPrev().setNext(delete.getNext());
		delete.getNext().setPrev(delete.getPrev());
		return delete;
	}

	public void insertBefore(int insertVal, int val) {
		DLLN cur = findNode(val);
		DLLN insert = new DLLN(insertVal, cur.getPrev(), cur);
		insert.getPrev().setNext(insert);
		insert.getNext().setPrev(insert);
	}

}
