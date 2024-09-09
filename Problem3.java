public class Problem3
{
  public static void main(String[] args)
  {
    int num = 9872;
    System.out.println("Four digit number: " + num);

    int oneDigit = num/1000;
    int twoDigit = (num/100)%10;
    int threeDigit = (num/10)%10;
    int fourDigit = num%10;
    
    System.out.println("Here are the digits in reverse order:");
    System.out.println(fourDigit);
    System.out.println(threeDigit);
    System.out.println(twoDigit);
    System.out.println(oneDigit);
  }
}


