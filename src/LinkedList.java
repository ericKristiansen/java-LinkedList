import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This is a basic linked list class
 */
public class LinkedList<AnyType>
{
    private Node<AnyType> head;
    private Node<AnyType> tail;

    public LinkedList()
    {
        head = tail = null;
    }

    public Node<AnyType> getHead()
    {
        return head;
    }

    public Node<AnyType> getTail()
    {
        return head;
    }

    public void setHead(Node<AnyType> passHead)
    {
        head = passHead;
    }

    public void setTail(Node<AnyType> passTail)
    {
        tail = passTail;
    }

    public Node<AnyType>RemoveHead()
    {
        head = head.getNext();
        Node<AnyType> oldHead = new Node(head);

        return oldHead;
    }

}


