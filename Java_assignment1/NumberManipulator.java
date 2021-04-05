
java.util.Scanner;

class NumberManipulator
{
   int reverseNumber(int number)
   {
      int x=number,r,revNum=0;
      while(x!=0)
      {
        r=x%10;
        revNum=revNum*10+r;
        x=x/10;
      }
      return revNum;
   }
   int calculateSum(int number)
   {
      int sum=0,r;
      while(number!=0)
      {
         r=number%10;
         sum=sum+r;
         number=number/10;
      }
      return sum;
   }
}
public class NumberManipulatorMain
{
   public static void main(String args[])
   {
      NumberManipulator obj=new NumberManipulator();
      Scanner in=new Scanner(Sytem.in);
      int number=in.nextInt();
      int ReverseNumber=obj.reverseNumber(number);
      System.out.println(ReverseNumber);
      int Sum=obj.calculateSum(number);
      System.out.println(Sum);
   }
}