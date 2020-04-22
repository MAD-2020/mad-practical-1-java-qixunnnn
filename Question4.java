import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
      System.out.print("Enter a number: ");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();

      for (int i=0;i<num; i++) {
          for(int j=num;j>i; j--)
          {
              System.out.print("*");
          }
          System.out.println();
      }
    }
  }
}
