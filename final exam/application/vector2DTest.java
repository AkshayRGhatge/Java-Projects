/*Vector2DTest.java is a program that test the program
 *author:Akshay Ghatge 
 */
package application;


import java.util.Scanner;//scans input

//declartion of class Vector2DTest

public class Vector2DTest
{
    public static void main(String args[])
    {
        //declaration and initialization 
        Scanner input=new Scanner(System.in);
        Double x;
       Double y;
           Double average;

        System.out.println("Enter X1 and Y1 coordinates for first vector: " );

        x=input.nextDouble();

        y=input.nextDouble();

        Vector2D vec1=new Vector2D(x,y);

        //input for vector 2

        System.out.println("Enter X2 and Y2 coordinates for second vector: " );

        x=input.nextDouble();

        y=input.nextDouble();

        Vector2D vec2=new Vector2D(x,y);

        //print vectors

        System.out.println("The magnitude of first vector is: "+vec1.magnitude(x,y));

       
        System.out.println("The magnitude of second vector is: "+vec2.magnitude(x,y));

       
        // average

        average= (vec1.magnitude(x,y)+vec2.magnitude(x,y))/2;

        System.out.printf("The average magnitude of both vectors is: %.2f",average);

 
    }//end of main method

}//end of class Vector2DTest