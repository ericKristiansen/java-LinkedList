import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This is a basic linked list class
 */
public class LinkedList<AnyType>
{
    private Node<AnyType> head;
    private Node<AnyType> tail;


    /**
     * Fetch the head of the list.
     * @return head
     */
    public Node<AnyType> getHead()
    {
        return head;
    }

    /**
     * Fetch the tail of the list.
     * @return tail
     */
    public Node<AnyType> getTail()
    {
        return head;
    }

    /**
     * Assign the head of the list.
     * @param passHead
     */
    public void setHead(Node<AnyType> passHead)
    {
        head = passHead;
    }

    /**
     * Assign the tail of the list.
     * @param passTail
     */
    public void setTail(Node<AnyType> passTail)
    {
        tail = passTail;
    }

    /**
     *  Remove the head from the list.
     * @return head
     */
    public Node<AnyType>RemoveHead()
    {
        head = head.getNext();
        Node<AnyType> oldHead = new Node(head);

        return oldHead;
    }

}


