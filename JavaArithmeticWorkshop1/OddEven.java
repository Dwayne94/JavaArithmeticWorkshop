/*
Name: Dwayne Dsouza
Class: In this class, wel will make use of the Scanner. When the User enters a Number then, the System will display if the number entered is 
an Even or Odd Number. Method is created using if-else condition and called to print the final result. 
 */

//Import the required library 
import java.util.Scanner; 

//Create the Class
public class OddEven 
{
    //Create the Main Method 
    public static void main (String args[])
    {
        //Create the Scanner 
        Scanner sc = new Scanner(System.in);

        //Print the Statement 
        System.out.print("Please enter the Number: ");
        //System will store the entered number in a variable 
        int number = sc.nextInt();

        //Move the cursor to the next line
        System.out.println();

        //Print the final statement by calling the method to determine if number entered is Even or False
        System.out.print(CalculateEvenorOdd(number));

        //Close the Scanner
        sc.close();
    }

    //Create a Method to determine if number entered is Even or Odd
    public static String CalculateEvenorOdd(int number)
    {
        //If the remainder of the number is 0
        if(number%2 == 0)
        {
            //Return the statement 
            return "The number entered is Even!";
        }
        else
        {
            //Return the statement 
            return "The number entered is Odd!";
        }
    }
}
