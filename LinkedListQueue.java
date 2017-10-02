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
      . . .
   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      . . .
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
      . . .
   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {
      . . .
   }

   class Node
   {
      public Object data;
      public Node next;
   }
}
