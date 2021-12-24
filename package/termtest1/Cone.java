/*Cone.java is the program that calculate the surface area of the cone
 * author:Akshay Ghatge
 */
package termtest1;
import java.util.Scanner;//Package use to Scan the input

public class Cone{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        double radius,height,area;
        Scanner input=new Scanner(System.in);//for input
        System.out.print("Enter the radius of the Cone:");
        radius=input.nextDouble();
        System.out.print("Enter the height of the Cone:");
        height=input.nextDouble();
        area=Math.PI*radius*(radius+(Math.sqrt(Math.pow(height,2)+Math.pow(radius,2))));//Calculate the area of the cone
        System.out.println("The surface area of the cone is"+area);
      
    }//end of the main method
}//end of the class 