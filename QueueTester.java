/**
   Testing the LinkedListQueue class.
*/
public class QueueTester
{
   public static void main(String[] args)
   {
      LinkedListQueue q = new LinkedListQueue();
      q.add("Tom");
      q.add("Diana");
      q.add("Harry");
      while (!q.empty())
      {
         System.out.print(q.remove() + " ");
      }
      System.out.println();
      System.out.println("Expected: Tom Diana Harry");
   }
}
