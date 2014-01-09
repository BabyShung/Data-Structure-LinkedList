package SinglyLinkedList;
 

/**
 *
 * @author haozheng
 * 
 * this LL only has a head, not tail
 * 
 * DLL and firstlastLL has both head and tail
 */
public class SinglyLinkedList<T>
{

	SinglyLinkedListNode<T> head;


    public SinglyLinkedList( T element )
    {
        head = new SinglyLinkedListNode<T>( null, new SinglyLinkedListNode<T>( element, null ) );
    }

    //empty LL with just the head
    public SinglyLinkedList()
    {
        head = new SinglyLinkedListNode<T>( null, null );
    }

    public void addToFront( T element )
    {
        SinglyLinkedListNode<T> newHead =
                new SinglyLinkedListNode<T>( element, head.getNext( ) );
        head.setNext( newHead );
    }

    
    
    public void addToBack( T element )
    {
        SinglyLinkedListNode<T> cursor = head;

        while( cursor.getNext() != null )
        {
            cursor = cursor.getNext();
        }

        cursor.setNext( new SinglyLinkedListNode<T>( element, null ) );
    }

    public SinglyLinkedListNode<T> getHead(){
    	return head;
    }
    
    @Override
    public String toString( )
    {
        String listString = "";

        for( SinglyLinkedListNode<T> cursor = head; cursor != null;
                cursor = cursor.getNext( ) )
        {
            listString += cursor.toString() + " -> ";
        }

        return listString + "END-OF-LIST";
    }
}