import java.util.Scanner;

public class WithBreaksIfElseVersion
{
   public static void main(String[] args)
   {
      int number;
      Scanner keyboard = new Scanner(System.in);
   
      System.out.print("Enter 1, 2, or 3: ");
      number = keyboard.nextInt();
      
      if (number == 1)
      {
         System.out.println("You entered 1.");
      }
      else if (number == 2)
      {
         System.out.println("You entered 2.");
      }
      else if (number == 3)
      {
         System.out.println("You entered 3.");
      }
      else
      {
         System.out.println("That's not 1, 2, or 3!");
      }
   }
}
        
   