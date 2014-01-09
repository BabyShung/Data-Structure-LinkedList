package applications;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;


public class DeleteDuplicate {

	private SinglyLinkedList<Integer> sll;
	private Random rm;
	private Map<Integer, Integer> ht;
	
	public DeleteDuplicate(){
		
		sll = new SinglyLinkedList<Integer>();
		rm = new Random();
		//initRandomElements(5,sll);
		initFixedElements(sll);
		ht = new HashMap<Integer, Integer>();
	}

	private void initRandomElements(int num, SinglyLinkedList<Integer> list) {	
		for(int i = 0; i<num;i++)
			list.addToFront(rm.nextInt(100));
		System.out.println(list);
	}
	
	private void initFixedElements(SinglyLinkedList<Integer> list) {	
		list.addToFront( new Integer( 100 ) );
		list.addToFront( new Integer( 50 ) );
		list.addToBack( new Integer( 150 ) );
		list.addToBack( new Integer( 200 ) );
		list.addToFront( new Integer( 0 ) );
		list.addToFront( new Integer( 0 ) );
		list.addToFront( new Integer( 100 ) );
		System.out.println(list);
	}
	
	public void deleteDuplicate(){
		SinglyLinkedListNode<Integer> prep = sll.getHead();
		for(SinglyLinkedListNode<Integer> cursor = sll.getHead().getNext(); cursor != null;
                cursor = cursor.getNext()){
			if(ht.containsKey(cursor.getElement())){
				prep.setNext(cursor.getNext());
			}else{
				ht.put(cursor.getElement(), 1);
				prep = cursor;
			}
		}
		
		System.out.println(sll);
	}
	
}
