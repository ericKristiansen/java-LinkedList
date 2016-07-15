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
    public Node<AnyType>removeHead()
    {
        head = head.getNext();
        Node<AnyType> oldHead = new Node(head);

        return oldHead;
    }

    public void appendHead(Node<AnyType> passNode)
    {
        //case empty
        if (head == null)
        {
            head = tail = passNode;
        }
        //case not empty
        else
        {
            passNode.setNext(head);
            head = passNode;
        }
    }

    public void appendTail(Node<AnyType> passNode)
    {
        //case empty
        if (head == null)
        {
            head = tail = passNode;
        }
        //case not empty
        {
            tail.setNext(passNode);
            tail = passNode;
        }
    }

    /**
     * Print the contents of the list
     */
    public void printList()
    {
        if (head != null)
        {
            System.out.println("List:");
            Node currentNode = head;
            while (currentNode != null)
            {
                System.out.println(currentNode.getData().toString());
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }

    }

}


