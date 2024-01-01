/*
Name: Dwayne Dsouza
Class: In this class we will use the scanner and ask the User to enter the required temperature in Fahrenheit. System will then convert this 
temperature in Fahrenheit to degree Celsius. We will create a method and then call the method to display the value. 
 */

//Import the required library
import java.util.Scanner;

//Create the Class
public class ConvertTemperature1 
{
    //Create the Main Method
    public static void main (String args [])
    {
        //Create the Scanner
        Scanner sc = new Scanner(System.in);

        //Print the statement 
        System.out.print("Please enter the temperature in Fahrenheit: ");
        //System will store the entered value in a variable 
        float fahrenheit = sc.nextFloat();

        //Move the cursor to the next line
        System.out.println();

        //Print the statement 
        System.out.print("The temperature calculated in degree Celsius is: " + ConvertFahrenheitToCelsius(fahrenheit) + "'C");

        //Close the Scanner 
        sc.close();
    }

    //Create the method to convert Fahrenheit to Celsius
    public static float ConvertFahrenheitToCelsius(float fahrenheit)
    {
        //Frmula to calculate Fahrenheit to Celsius
        float celsius = (fahrenheit - 32)*5/9;
        //return the Celsius value
        return celsius;
    }
}