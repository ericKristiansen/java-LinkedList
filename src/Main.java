/**
 * Main Client Class to test data structure
 *
 * @author Eric Kristiansen
 * @version 7/15/2016
 */
public class Main
{

    public static void main(String [ ] args)
    {
        try
        {
            LinkedList<Node<Data>> linkedList = new LinkedList<>();

            linkedList.printList();

            //create elements
            System.out.println("adding element to head:");
            linkedList.appendHead(new Node(new Data("First Data Element")));
            System.out.println("adding element to tail:");
            linkedList.appendTail(new Node(new Data("Last Data Element")));

            linkedList.printList();

            System.out.println("adding element to head:");
            linkedList.appendHead(new Node(new Data("More First Data Element")));
            System.out.println("adding element to tail:");
            linkedList.appendTail(new Node(new Data("More Last Data Element")));

            linkedList.printList();

            System.out.println("removing element from head:");
            linkedList.removeHead();

            linkedList.printList();

        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }

}
