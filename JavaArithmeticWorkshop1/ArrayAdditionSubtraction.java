/*
Name: Dwayne Dsouza
Class: In this class we will perform the Addition and Subtraction of all numbers present in the Array. 
 */

//Create the Class
public class ArrayAdditionSubtraction 
{
    //Create the Main Method 
    public static void main(String args[])
    {
        //Declare and Initialize the Array 
        float numbersArray[] = {543.23F, 26.12F, 37.46F, 81.63F, 93.55F};

        //Declare and Initialize the variable for addition
        float totalSum = 0.00F;

        //Declare and Initialize the variable for subtraction to the 1st index number of the Array
        float totalSubtract = numbersArray[0];

        /*A new method of using For-loop. Instead of using the traditional way of initializing, condition and increment, this method will 
        declare a variable which will represent every element in the Array*/  
        for(float number : numbersArray)
        {
            //totalSum = totalSum + numbersArray[i]
            //This means 1st 2 numbers will be added and stored as totalSum. then (1st+2nd) + 3rd will be added again and so on.
            totalSum += number;
        }

        //Print the statement to display the value of the total sum of the numbers in the Array
        System.out.println(totalSum + " is the total sum of the numbers in the Array");

        //Subtract all the elements in the Array and keep repeating till all the elements are subtracted
        //i=1 because we have already initialized totalSubtract to the 1st index value
        for(int i=1; i<numbersArray.length; i++)
        {
            //totalSubtract = totalSubtract - numbersArray[i]
            //This means 1st 2 numbers will be subtracted and stored as totalSubtract. then (1st-2nd) - 3rd will be subtracted again and so on.
            totalSubtract -= numbersArray[i];
        }

        //Print the statement to display the value of the total sum of the numbers in the Array
        System.out.println(totalSubtract + " is the total subtraction of the numbers in the Array");
    }
}
