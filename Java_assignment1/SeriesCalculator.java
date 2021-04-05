
import java.util.Scanner;

public class SeriesCalculator
{
   static int calculateSum(int n)
   {
      int q=n;
      int x=(n-1);
      int b=x*2;
      int y=b+2;
      int p=q/2;
      int Sum=p*y;
      return Sum;
   }
   public static void main(String[] args)
   {
      int n;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter a number");
      n=in.nextInt();
      int sum=calculateSum(n);
      System.out.println(sum);
   }
}