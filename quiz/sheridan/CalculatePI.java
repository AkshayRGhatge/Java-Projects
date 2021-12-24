/*CalculatePI.java is a program that calculate the value of PI
 * author:Akshay Ghatge 991541118
 */
package sheridan;
import java.util.Scanner;//use for input
public class CalculatePI
{
   
    public static void main(String[] args)
    {
        //Declaration and Initialization
        double pi;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value:");
        int userInput=input.nextInt();
        CalculatePI self=new CalculatePI();
        self.calculate(userInput);
        
        
    }//end of the main method
    public void calculate(double userKey)
    {
        double total=0.0;
       
        
        for(int userInp=1; userInp==userKey; userInp++)    
        {
            double pi=4*((1.0/userInp)-(1/userInp+2));
            System.out.print("The value of pi :"+ pi);
        }
        
    }//end of the calculate method
}//end of the class