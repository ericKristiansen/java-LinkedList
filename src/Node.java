/**
 * This is a basic Node class to be used in the LinkedList class
 */
public class Node<AnyType>
{
    private AnyType data;
    private Node<AnyType> next;


    /**
     * Constructor taking one parameter
     * @param passData
     */
    public Node(AnyType passData)
    {
        this.data = passData;
    }

    /**
     * Constructor taking two parameters
     * @param passData
     * @param passNext
     */
    public Node(AnyType passData, Node<AnyType> passNext)
    {
        data = passData;
        next = passNext;
    }

    /**
     * Copy Constructor
     * @param passNode
     */
    public Node(Node<AnyType> passNode)
    {
        this.data = passNode.getData();
        this.next = passNode.getNext();
    }

    /**
     * Fetch data.
     * @return data
     */
    public AnyType getData()
    {
        return data;
    }

    /**
     * Fetch next.
     * @return next
     */
    public Node<AnyType> getNext()
    {
        return next;
    }

    /**
     * Set the next Node.
     * @param passNode
     */
    public void setNext(Node<AnyType> passNode)
    {
        next = passNode;
    }

    /**
     * Set data.
     * @param passNode
     */
    public void setData(Node<AnyType> passNode)
    {
        data = passNode.getData();
    }

    /**
     * Copy passNode into this one, and return this Node.
     * @param passNode
     * @return this
     */
    public Node<AnyType> copyNode(Node<AnyType> passNode)
    {
        if (this != passNode)
        {
            this.setNext(passNode.getNext());
            this.setData(passNode);
        }

        return this;
    }

}
