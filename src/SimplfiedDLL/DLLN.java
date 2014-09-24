package SimplfiedDLL;

public class DLLN {

	private int val;
	private DLLN prev;
	private DLLN next;

	public DLLN(int val, DLLN prev, DLLN next) {
		this.val = val;
		this.prev = prev;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public DLLN getPrev() {
		return prev;
	}

	public DLLN getNext() {
		return next;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public void setPrev(DLLN prev) {
		this.prev = prev;
	}

	public void setNext(DLLN next) {
		this.next = next;
	}

}
