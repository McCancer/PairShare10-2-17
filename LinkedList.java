import java.util.NoSuchElementException;
/**
   A linked list is a sequence of nodes with efficient
   element insertion and removal. This class
   contains a subset of the methods of the standard
   java.util.LinkedList class.
   Complete the reverse method by reversing the links in a
   the list. Implement this method by directly rerouting the
   links, not by using an iterator.
*/
public class LinkedList
{
   private Node first;

   /**
      Constructs an empty linked list.
   */
   public LinkedList(){
       first = null;
    }

   /**
      Reverses all elements in a linked list.
   
   public void reverse()
   {
      // Complete this method
      LinkedList Killme = new LinkedList();
      LinkedList Killme2 = new LinkedList();
      while(first != null){
          Killme.addFirst(this.removeFirst());
        }
      while(Killme.first != null){
          Killme2.addFirst(Killme.removeFirst());
      }
      while(Killme2.first != null){
          this.addFirst(Killme2.removeFirst());
      }
      
   }*/
   /**
      Reverses all elements in a linked list.
   */
   public void reverse()
   {
      // Complete this method
      Node node1 = new Node();
      Node node2 = new Node();
      while(first != null){
          node2 = first.next;
          first.next = node1;
          node1 = first;
          first = node2;
        }
   }


   /**
      Returns the first element in the linked list.
      @return the first element in the linked list
   */
   public Object getFirst(){
       if (first == null)//Checks to see if the first node is empty
       { throw new NoSuchElementException();}//Throws an exception if it is
       return first.data;//Returns the data of the first node
    }

   /**
      Removes the first element in the linked list.
      @return the removed element
   */
   public Object removeFirst(){
       if (first==null)//checks to see if the first node is empty
       {throw new NoSuchElementException();} //Throws an exception if it is 
       
       Object element = first.data; //takes the data from the first node
       first= first.next; // sets first to what the old first is pointing at
       return element; // returns the data from the old first node
       
    }

   /**
      Adds an element to the front of the linked list.
      @param element the element to add
   */
   public void addFirst(Object elements){
       Node newNode = new Node();
       newNode.data = elements; //Makes it an alias
       newNode.next = first; //Just alias to next node
       first = newNode; //sets new node to the first thing in the list
    }
   /**
      Returns an iterator for iterating through this list.
      @return an iterator for iterating through this list
   */
   public LinkedListIterator listIterator(){
       return new LinkedListIterator(); // Creates an iterator class and returns it
    }
<<<<<<< HEAD
    
   /**
    * Returns a true if the object is in the list
    */
   public boolean Contains(Object obj){
     Node Walker = new Node();
     Walker = first;
     while(Walker.next != null){
         if((Walker.data).equals(obj)){
             return true;
            }
         else{
            Walker = Walker.next;
            }
        }
     return false;
    }
    
    private int sizeHelper(Node temp)
   {   int count = 0;
       if (first == null)
        return 0;
       if (count == 0)
        temp = first;
       if(temp.next != null){
           count = 1 + sizeHelper(temp.next);
        }
       return count;
   }
   public int size()
   {
       return sizeHelper(first);
    }
=======
>>>>>>> parent of a1c947e... dsdsd
   //Class Node
   class Node{
       public Object data;
       public Node next;
    }
     class LinkedListIterator implements ListIterator
     {
      //private data
      private Node position;//Used to keep track of where we are
      private Node previous;
      private boolean isAfterNext; //flag for when next is called
      /**
         Constructs an iterator that points to the front
         of the linked list.
      */
      public LinkedListIterator(){
          position = null;
          previous = null;
          isAfterNext = false;
        }

      /**
         Moves the iterator past the next element.
         @return the traversed element
      */
      public Object next(){
          if(!hasNext())
          { throw new NoSuchElementException();}
          previous = position; //Remember for move
          isAfterNext = true; 
          
          if (position == null){ // if | is at the start, before the first node
              position = first;
            }
          else{ //Lets move you little doggie
              position = position.next;
            }
          return position.data;
        }


      /**
         Tests if there is an element after the iterator position.
         @return true if there is an element after the iterator position
      */
      public boolean hasNext(){
          if(position == null){ //Are we at the start of the :: pr mpt called next yet?
              return first != null;
            }
          else{
              return position.next != null; //if current not null is next node/dude = to null
            }
        }

      /**
         Adds an element before the iterator position
         and moves the iterator past the inserted element.
         @param element the element to add
      */
      public void add(Object element){
          if(position == null){// nothing in list yet
              addFirst(element);
              position = first;// so I am the first node/dude
            }
          else{
              Node newNode = new Node();
              newNode.data = element; //I'm an alias/ref
              newNode.next = position.next; // i know who is next
              position.next = newNode; //Iterator thinks next is me
              position = newNode; //current position is me :), little conflict if you call remove 
            } 
          isAfterNext = false;
        }

      /**
         Removes the last traversed element. This method may
         only be called after a call to the next() method.
      */
      public void remove(){
          if (!isAfterNext){//Flag false so next has not been called
               throw new IllegalStateException();
            }
          if(position == first){
              removeFirst(); //just call method in LL, Access OK we = innerclass
            }
          else{
              previous.next = position.next; //move ref of previous to node after me, bye bye
            }
          //before previous = node before me
          //now current position in iterator is previous because we remove 
          position = previous;
          
          isAfterNext = false;
        }

      /**
         Sets the last traversed element to a different value.
         @param element the element to set
      */
      public void set (Object element){
          if(!isAfterNext){//Flag false so next has not been called
              throw new IllegalStateException();
            }
            
          position.data = element;
        }

    }
}
