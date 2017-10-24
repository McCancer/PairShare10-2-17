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
   
   /**
    * Moves the node at the head to the tail
    */
   public void FirsttoLast(){
     if(empty()){ // Checks to see if it is empty if ti is throws an exception
         throw new NoSuchElementException();
        }
     Node transfer = new Node(); //Creates a new node 
     transfer.data = head.data; //takes the data of the head
     tail.next = transfer; // makes it so the tail points at transfer
     head = head.next; // second become first
     tail = tail.next; // tail is now transfer node
    }
   
    /**
     * Kunzer Wrote this
     */
   public void LasttoFirst(){
     Node Next = new Node(); //Creates a new node called Next
     Node Walker = new Node(); // Creates a new node Called Walker
     Node Transfer = new Node();// Creates a new node called transfer
     Next = head.next;// next is whatever is next to whatever is currently walker
     while(Next.next != null){ // while whatever is after next is not null then run this
         Walker = Next;// walker is now set to whatever is next
         Next = Next.next; // next is now painfully whatever next.next is
        }
     Transfer.data = tail.data; //sets transfer's data to the tails data
     Transfer.next = head; // make it so transfer points at the head
     head = Transfer; // set head to the new transfer
     
     Walker.next = null; // make walker point at nothing
     tail = Walker; // set the tail to the walker 
    }
   class Node
   {
      public Object data;
      public Node next;
   }
}
