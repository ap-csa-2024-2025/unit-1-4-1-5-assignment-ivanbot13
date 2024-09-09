public class Problem1
{
  public static void main(String[] args)
  {
    int num = 1;
    System.out.println("The inital value is " + num);

    for (int i = 0; i < 4; i++) {
      num++;
      System.out.println("The number is now: " + num);
    }

    for (int i = 0; i < 4; i++) {
      num--;
      System.out.println("The number is now: " + num);
    }
    
  }
}

