/*
Name: Dwayne Dsouza
Class: In this class we will determine if the number entered is a Prime Number or not. We will make use of the Scanner. We will declare a variable 
of boolean type and initialize it to True. If the number entered is lesser than 2 then the number is NOT a Prime Number. If the Number entered 
is 2 or greater than 2 then, the system will consider every number from 2 upto 1 less than the number entered and determine if the remainder 
is 0 or not when divided. If the remainder is 0 then the entered number is NOT a Prime Number. 
 */

//Import the required library 
import java.util.Scanner;

//Create the Class
public class PrimeNumber 
{
    //Create the Main Method 
    public static void main (String args[])
    {
        //Create the Scanner
        Scanner sc = new Scanner(System.in);

        //Print the statement 
        System.out.print("Please enter the Number: ");
        //System will store the number entered in a variable 
        int number = sc.nextInt();

        //Initialize the Variable to True
        boolean isPrime = true;

        //Move the cursor to the next line
        System.out.println();

        //To determine if a number is Prime, we need to divide the entered number by all numbers whose value is lesser than the entered number
        //Making use of the For-loop 
        for(int i=2; i<number; i++)
        {
            //If the remainder equals to 0 for the number entered divided by each number starting from 2
            if(number%i == 0)
            {
                //Number is not Prime 
                isPrime = false;
                //We make use of break because if any number divided is found to have a remainder 0 then we need to break the loop
                break;
            }
        }

        //If the Number entered is lesser than 2
        /*However we cannot use 1 since all Prime Numbers are Natural Numbers and 2 is the smallest Prime Number. Any Number divided by 1 will 
        return a remainder of 0*/ 
        if(number <=1)
        {
            isPrime = false;        
        }

        //If the Number is Prime
        if(isPrime)
        {
            //Print the Statement 
            System.out.println(number + " is a Prime Number!");
        }
        else
        {
            //If the Number is Not Prime then Print the Statement
            System.out.println(number + " is NOT a Prime Number!");
        }

        //Close the Scanner 
        sc.close();
    }
}
