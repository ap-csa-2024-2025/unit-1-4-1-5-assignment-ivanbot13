public class Problem2
{
  public static void main(String[] args)
  {
    int num = 987;
    System.out.println("Three digit number: " + num);

    int firDigit = num/100;
    int secDigit = (num/10)%10;
    int thrDigit = num%10;
    
    System.out.println("Here are the digits:");
    System.out.println(firDigit);
    System.out.println(secDigit);
    System.out.println(thrDigit);
  }
}


