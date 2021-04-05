
import java.util.Scanner;

class PrimeChecker
{
   static boolean checkPrime(int n)
   {
      if(n==1)
       return false;
      int flag=0;

      for(int i=2;i<=n/2;i++)
       if(n%i==0)
         flag++;
 
     if(flag==0)
       return true;
      else
       return false;
   }
   public static void main(String[] args)
   {
     int n;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the number ");
     n=in.nextInt();
     boolean x=checkPrime(n);
     System.out.println(x);
   }
}