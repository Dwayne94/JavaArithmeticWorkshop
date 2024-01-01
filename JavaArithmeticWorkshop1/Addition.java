/*
Name: Dwayne Dsouza
Class: In this class, we use the Scanner to enter the value of 2 numbers to perform the addition of the 2 numbers. 
 */

//Import the required library
import java.util.Scanner;

//Create the Class
public class Addition 
{
   public static void main (String args [])
   {
      //Create the Scanner 
      Scanner sc = new Scanner(System.in);

      //Print the statement 
      System.out.print("Please enter the 1st number: ");
      //System to store the entered number in the variable 
      int num1 = sc.nextInt();

      //Move the cursor to the next line
      System.out.println();

      //Print the statement 
      System.out.print("Please enter the 2nd number: ");
      //System to store the entered number in the variable
      int num2 = sc.nextInt();

      //Move the cursor to the next line
      System.out.println();

      //Perform the Addition operation and store the value in the variable
      int sum = num1 + num2;
      //Print the statement with the answer
      System.out.print("The addition of the entered numbers is: " + sum);

      //Close the Scanner
      sc.close();
   }
}
