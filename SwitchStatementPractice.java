import java.util.Scanner;

public class SwitchStatementPractice
{
   public static void main(String[] args)
   {
      int number;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, or 10: ");
      number = keyboard.nextInt();
      
      switch(number)
      {
         case 1:
            System.out.println("You entered I.");
         case 2:
            System.out.println("You entered II.");
         case 3:
            System.out.println("You entered III.");
         case 4:
            System.out.println("You entered IV.");
         case 5:
            System.out.println("You entered V.");
         case 6:
            System.out.println("You entered VI.");
         case 7:
            System.out.println("You entered VII.");
         case 8:
            System.out.println("You entered VIII.");
         case 9:
            System.out.println("You entered IX.");
         case 10:
            System.out.println("You entered IX.");
         default:
            System.out.println("Invalid number.");
         }
      }
  }
