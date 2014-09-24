package SimplifiedSLL;

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

public class SLL {

	// head
	protected SListNode head;

	public SLL() {
		head = new SListNode(-1, null);
	}

	public SLL(int val, SListNode next) {
		head = new SListNode(val, next);
	}

	public void addToFront(int val) {
		// this case is we have a solid head, if there is no head, we should
		// check if(head == null)...
		SListNode cur = new SListNode(val, head.getNext());
		head.setNext(cur);
	}

	public void addToBack(int val) {
		SListNode cur = head;
		while (cur.getNext() != null) {
			cur = cur.getNext();
		}
		cur.setNext(new SListNode(val, null));
	}

	public SListNode deleteNode(int val) {
		SListNode before = findNodeBefore(val);
		SListNode delete = before.getNext();
		if (before != null) {
			before.setNext(delete.getNext());
		}
		return delete;
	}

	protected SListNode findNodeBefore(int val) {
		SListNode cur = head;
		while (cur.getNext() != null && cur.getNext().getVal() != val) {
			cur = cur.getNext();
		}
		return cur == head ? null : cur;
	}

	protected SListNode findNode(int val) {
		SListNode cur = head.getNext();
		while (cur != null && cur.getVal() != val) {
			cur = cur.getNext();
		}
		return cur;
	}

}
