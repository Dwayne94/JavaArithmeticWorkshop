/*
Name: Dwayne Dsouza
Class: In this class we will obtain the Factorial of the number entered by the User. Scanner will be used where the System will take the value 
entered by the User and calculate the Factorial of the number entered.
 */

//Import the required library 
import java.util.Scanner;

 //Create the Class 
public class Factorial 
{
    //Create the Main method
    public static void main(String args[])
    {
        //Create the Scanner 
        Scanner sc = new Scanner(System.in);

        //Print the statement to request User to enter the Number 
        System.out.print("Please enter the number(Non-Negative Integer) whose Factorial is required to be calculated: ");
        //System will scan the entered input and store in the variable 
        int number = sc.nextInt();

        //Move the cursor to the next line
        System.out.println();

        //Declare and Initialize the variable
        int factorial = 1; 

        //Based on the number entered by the User, system needs to keep decrementing the value by 1 till it reaches 1
        for(int i=number; i>1; i--)
        {
            //If the number entered is 4 then factorial of 4 equals 1x4=4
            //Next factorial will decrement by 1 equals 4x3=12
            //Next factorial will decrement by 1 equals 12x2=24
            factorial = factorial*i;
        }

        //Display the result along with statement 
        System.out.print("The Factorial of " + number + " is: " + factorial);

        //Close the Scanner 
        sc.close();
    }
}
