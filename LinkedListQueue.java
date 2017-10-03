import java.util.NoSuchElementException;
/**
   Implement a queue as a sequence of nodes.
*/
public class LinkedListQueue
{
   private Node head;
   private Node tail;

   /**
      Constructs an empty queue.
   */
   public LinkedListQueue()
   {
      head = null;
      tail =  null;
   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      return head == null; 
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
      Node newnode = new Node(); // Creates new Node
      newnode.data = newElement; //Puts Data into node
      if(empty()){ //Sees if the node is empty
        head = newnode;} //if node is empty then head is the node
      else{
        tail.next = newnode; //if node is not empty then the tail need to point 
                             // to this
        }
      tail = newnode; // tail is now equal to this node
   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {
       if(empty()){ // checks to see if empty and if it is thows exception
           throw new NoSuchElementException();
        }
      Object element = head.data; //takes data from head
      head = head.next; //makes second in line new head
      return element; //sends back the data
   }

   class Node
   {
      public Object data;
      public Node next;
   }
}
