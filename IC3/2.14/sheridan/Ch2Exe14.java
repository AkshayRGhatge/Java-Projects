/*Ch2Exe14.java computes BMI
 * author:Akshay Ghatge
 */

package sheridan; 
import java.util.Scanner;//use to scan the input
//Definiton of the class Ch2Exe14
public class Ch2Exe14{
    public static void main(String[] args){
        //Declarations & Initailizations
        double poundTokg = 0.45359237;//1 pound is 0.45359237 kg
        double inchTomtr = 0.0254;//1 inch is 0.0254meters
        double measureInpounds;// represent values in pounds
        double measureIninches;// represent values in inches
        double measureInkg;
        double measureInmtr;
        double bmi;//represent value of BMI
        Scanner input= new Scanner(System.in);
       
        // input from the keyboard
         System.out.print("Enter weight in pounds");
         measureInpounds=input.nextDouble();
         System.out.print("Enter height in inches");
          measureIninches = input.nextDouble();
        
        //convert pound to kg
       measureInkg = measureInpounds*poundTokg;
       
          //convert inches to meters
       measureInmtr=measureIninches*inchTomtr;
       
       // calculating BMI
       bmi=(measureInkg/(Math.pow(measureInmtr,2)));
        System.out.println("BMI is:" +bmi);
    }//end of the main method  
}//end of the class