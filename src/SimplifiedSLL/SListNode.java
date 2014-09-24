package SimplifiedSLL;

public class SListNode {

	private int val;
	private SListNode next;

	public SListNode(int val, SListNode next) {
		this.val = val;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public SListNode getNext() {
		return next;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public void setNext(SListNode next) {
		this.next = next;
	}

}
