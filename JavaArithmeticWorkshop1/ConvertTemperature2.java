/*
Name: Dwayne Dsouza
Class: In this class we will use the scanner and ask the User to enter the required temperature in degree Celsius. System will then convert this 
temperature in Celsius to degree Fahrenheit. We will not create any method in this program. 
 */

//Import the required library 
import java.util.Scanner;

//Create the Class
public class ConvertTemperature2 
{
    //Create the Main Method 
    public static void main(String args [])
    {
        //Create the Scanner 
        Scanner sc = new Scanner(System.in);

        //Print the statement 
        System.out.print("Please enter the temperature in degree Celsius: ");
        //System will store the entered value in a variable 
        float celsius = sc.nextFloat();

        //Move the cursor to the next line
        System.out.println();

        //Calculation to convert degree Celsius to degree Fahrenheit
        float fahrenheit = (celsius * 9/5) + 32;

        //Print the statement with the value in Fahrenheit
        System.out.print("The temperature calculated in degree Fahrenheit is: " + fahrenheit + "'F");

        //Close the Scanner 
        sc.close();
    }
}
