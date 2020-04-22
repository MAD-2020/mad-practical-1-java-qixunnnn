import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     Scanner in = new Scanner(System.in);
    
     System.out.print("Enter your height in cm: ");
     double height = in.nextDouble();
    
     System.out.print("Enter your weight in kg: ");
     double weight = in.nextDouble();
    
     double bmi = weight/(height*height);

     System.out.println("BMI: " + bmi);
  }
}
