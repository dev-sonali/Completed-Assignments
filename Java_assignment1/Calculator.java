
public class Calculator
{
    int calculateSum(int number1,int number2)
    {
        int Sum=number1+number2;
        return Sum;
    }
    int calculateDifference(int number1,int number2)
    {
        int difference=number1-number2;
        return difference;
    }
}
public class Ques11
{
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        int sum=obj.calculateSum(10,30);
        System.out.println(sum);
        int Difference=obj.calculateDifference(30,10);
        System.out.println(Difference); 
    }
}