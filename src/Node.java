/**
 * This is a basic Node class to be used in the LinkedList class
 */
public class Node<AnyType>
{
    private AnyType data;
    private Node<AnyType> next;

    public Node()
    {
        data = null;
        next = null;
    }

    public Node(AnyType passData)
    {
        this.data = passData;
        next = null;
    }

    public Node(AnyType passData, Node<AnyType> passNext)
    {
        data = passData;
        next = passNext;
    }

    public AnyType getData()
    {
        return data;
    }

    public Node<AnyType> getNext()
    {
        return next;
    }

    public void setNext(Node<AnyType> passNode)
    {
        next = passNode;
    }

    public void setData(Node<AnyType> passNode)
    {
        data = passNode.getData();
    }

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
