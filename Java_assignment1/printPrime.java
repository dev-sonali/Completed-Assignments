
public class printPrime
{
   public static void main(String[] args)
   {
      int flag=0,j;
      for(j=2;j<=150;j++)
      {
        for(int i=2;i<=j/2;i++)
          if(j%i==0)
            flag++;
 
        if(flag==0)
         System.out.print(j+",");
        flag=0; 
      }
   }
}