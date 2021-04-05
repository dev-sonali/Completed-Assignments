
public class Ques16
{
  public static void main(String[] args) 
  {
    int j = 10;
    switch (1) 
    {
       case 20: j += 1;
       break;
       case 40: j += 2;
       break;
       default: j += 3;
       break;
       case 0:  j += 4;
       break;
    }
    System.out.print(j);
  }
}
