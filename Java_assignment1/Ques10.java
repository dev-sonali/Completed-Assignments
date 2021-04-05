
class MessagePrinter
{
    void printMessage(String name)
    {
        System.out.println("hello "+name);
    }
}
public class Ques10
{
   public static void main(String[] args)
   {
       MessagePrinter obj=new MessagePrinter();
       obj.printMessage("Sonali");  
   }
}