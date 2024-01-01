/*
Name: Dwayne Dsouza
Class: In this class we will determine if the entered input String by the User is a Palindrome or not. In a Palindrome 1st character equals 
last character, 2nd character equals 2nd last character and so on. We will make use of the scanner and ask the User to enter the String which 
will be converted to small case. 
 */

 //Import the required library 
 import java.util.Scanner;

 //Create the Class
public class Palindrome 
{
    //Create the Main method
    public static void main(String args[])
    {
        //Create the Scanner 
        Scanner sc = new Scanner(System.in);

        //Print the statement to ask the User to enter String
        System.out.println("Please enter the String to determine if it is a Palindrome or not: ");

        //System will scan the entered String and store in the variable
        String input = sc.nextLine();
        //We need to ensure that all the String characters are converted to Lower String
        input = input.toLowerCase();

        //Close the Scanner
        sc.close(); 

        //Declare and Initialize the Variable to default value "True"
        boolean isPalindrome = true;

        /*Using the For-loop for the system to compare the 1st letter with last letter, 2nd letter with 2nd last letter and so on for the 
        length of the String till the centre is reached.*/
        //i represents the start of the String and j represents the end of the String 
        //i has to be less than j because this ensures all the characters are compared. i cannot exceed or equal j. 
        //After each iteration i is incremented by 1 and j is decremented by 1. 
        for(int i=0, j=input.length()-1; i<j; i++, j--)
        {
            //If the character at index position 1 is not equal to the character at the last index position
            if(input.charAt(i) != input.charAt(j))
            {
                //String is NOT a Palindrome
                isPalindrome = false;
                //Terminate the loop
                break;
            }
        }

        //Print the statement to declare the result 
        //If the String is a Palindrome
        if(isPalindrome)
        {
            //Print the statement
            System.out.print(input + " is a Palindrome!");
        }
        //If the String is not a Palindrome
        else
        {
            //Print the statement
            System.out.print(input + " is NOT a Palindrome!");
        }
    }
}
