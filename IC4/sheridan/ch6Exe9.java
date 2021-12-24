/*ch6Exe9.java is the program that convert the feet value in the meter and viceversa
 * author:Akshay Ghatge
 */

package sheridan;
import java.util.Scanner;
//Declaration of the Class ch6Exe9
public class ch6Exe9
{
    public static void main(String[] args)
    {
        double userFeet;//represent the value of the feet
        double userMeter;//represent the value of the Meter
        double feetToMeter;//
        double meterToFeet;
        Scanner input=new Scanner(System.in);
        ch6Exe9 self=new ch6Exe9();
        //input 
        System.out.println("Enter the value in feet");
        userFeet=input.nextDouble();
        //call the method footToMeter
        feetToMeter=self.footToMeter(userFeet);
        //print the output
        System.out.println("Conversion of the feet to meter of("+userFeet+") is" +feetToMeter);
        //input
        System.out.println("Enter the value in meter");
        userMeter=input.nextDouble();
        //call the method meterToFoot
        meterToFeet=self.meterToFoot(userMeter);
        //print the output
        System.out.println("Conversion of the meter to feet of("+userMeter+")is"+meterToFeet);
    }   
    public double footToMeter(double feet)
    {
        //Declaration and Initialization
        double feetToMeter=0.305*feet;
        
        return feetToMeter;
    }
    public double meterToFoot(double meter)
    {
        //Declaration and Initialization
        double meterToFeet=3.279 * meter;
      
        return meterToFeet;
    }
}//end of the class ch6Exe9