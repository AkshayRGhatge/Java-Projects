/*Che3Exe1.java is a program that sove the quadratic equation
 *author:Akshay Ghatge
 */

package sheridan;
import java.util.Scanner;//use for input
public class Che3Exe1
{
    public static void main(String[] args) 
      {
        //Declaration and Initialization
        double a, b, c;
        double root1, root2, discriminant;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = b * b - 4 * a * c;
        if(discriminant > 0) //if discriminant positive
        {
    
            root1 = ( - b + Math.sqrt(discriminant))/(2*a);
            root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The equation has two root:"+root1+" and "+root2 );
            
        }
        else if(discriminant == 0)//if discriminant is zero
        {
          
            root1 = (-b +Math.sqrt(discriminant))/(2*a);
            System.out.println("The second has one root is:"+root1);
        }
        else
        {
            System.out.println("Roots has no real root");
        }
    }
}