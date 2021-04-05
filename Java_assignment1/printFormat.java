
public class printFormat
{
   public static void main(String args[])
   { 
      int i,j;
      for(i=1;i<=6;i++)
      {
         for(j=1;j<=i;j++)
          System.out.print(j);
         System.out.println();
      }
      int x=5;
      for(i=1;i<=5;i++)
      {
         for(j=1;j<=x;j++)
           System.out.print(j);
         System.out.println();
         x--;
      }
   }
}


