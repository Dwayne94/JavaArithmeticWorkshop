/*
Name: Dwayne Dsouza
Class: In this class we will print the Fibonacci series of the 1st 10 numbers. Scanner will be used and User will be asked to input the number 
of Fibonacci Series numbers required. The system will then print the first of the entered number of the Fibonacci Series. 
Fibonacci Series of 1st 10 numbers = 0, 1, 
 */

 //Import the required library 
 import java.util.Scanner;

//Create the Class
public class FibonacciSeries 
{
    //Create the Main method 
    public static void main(String args[])
    {
        //Create the Scanner 
        Scanner sc = new Scanner(System.in);

        //Print the statement requesting the user to enter the number of Fibonacci Series numbers required 
        System.out.print("Please enter the number of Fibonacci Series numbers required to be displayed: ");
        //System will scan and store the entered value in the variable 
        int fibonacciNumber = sc.nextInt();

        //Move the cursor to the next line
        System.out.println();
        
        //Declare and Initialize the 1st number of Fibonacci Series
        int number1 = 0;
        //Declare and Initialize the 2nd number of Fibonacci Series
        int number2 = 1;

        //Print the 1st 2 numbers of the Fibonacci Series 
        System.out.print("The first " + fibonacciNumber + " of the Fibonacci Series are: " + number1 + "," + number2);
        //Print the remainder of the Fibonacci Series numbers by calling the method
        CalculateFibonacciSeries(fibonacciNumber, number1, number2);

        //Close the Scanner
        sc.close();
    }

    //Create method to calculate the Fibonacci Series 
    public static void CalculateFibonacciSeries(int fibonacciNumber, int number1, int number2)
    {
        //1st 2 numbers of the Fibonacci Series are 0 and 1 and hence we start from the 2nd loop OR we can use i=0 and i<fibonacciNumber-2
        for(int i=2; i<fibonacciNumber; i++)
        {
            //Store the sum of the first 2 numbers in a variable
            int sum = number1 + number2;
            //Print the result of the Sum of number1 and number2. Comma introduced first because we have printed 0 and 1 just before this. 
            System.out.print("," + sum);
            //This condition states that for the next operation number2 takes the place of number1
            number1 = number2;
            //This condition states that for the next operation the sum takes the place of number2
            number2 = sum;
        }
    }
}
