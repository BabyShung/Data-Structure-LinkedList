package applications;

import SinglyLinkedList.SinglyLinkedList;
import SinglyLinkedList.SinglyLinkedListNode;

public class OperationLinkedList extends SinglyLinkedList<Integer> {

	
	// 1->2  +  3->9  =  4 -> 1 -> 1      (21+93 = 114)
	
//	public int additionBackToFront(SinglyLinkedList<Integer> sll1,SinglyLinkedList<Integer> sll2){
//		
//		if(sll1==null||sll2==null)
//			return 0;
//		
//		SinglyLinkedListNode<Integer> cur1 = sll1.getHead().getNext();
//		SinglyLinkedListNode<Integer> cur2 = sll2.getHead().getNext();
//		
//		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
//		SinglyLinkedListNode<Integer> cur3 = newList.getHead();
//		
//		while(cur1!=null && cur2!=null){
//			int digitSum = cur1.getElement()+cur2.getElement();
//			
//			
//			if(digitSum>9){
//				
//				if(cur3==null)
//					newList.addToBack(digitSum%10);
//					newList.addToBack(digitSum/10);
//				else{
//					cur3.setElement(cur3.getElement()+digitSum%10);
//					newList.addToBack(digitSum/10);
//				}
//			}else{//normal sum
//				if(cur3==null)
//					newList.addToBack(digitSum);
//				else
//					cur3.setElement(cur3.getElement()+digitSum);
//			}
//			
//			cur1 = cur1.getNext();
//			cur2 = cur2.getNext();
//			cur3 = cur3.getNext();
//		}
//		
//		//check both l1 and l2
//		if(cur1 == null){
//			
//		}
//		
//		return 0;
//	}
	
}
