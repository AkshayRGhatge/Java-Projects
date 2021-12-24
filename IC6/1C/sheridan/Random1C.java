/*Random1C.java is a program that generate a random number from -1.0 to 1.0
 * author:Akshay Ghatge
 */
package sheridan;
import java.util.Random;
public class Random1C{
    public static void main(String[] args)
    {
        //Declaration and Initalization
        Random rnd=new Random();
        float rndValue;
        rndValue= -1+rnd.nextFloat()+rnd.nextInt(2); 
        
        System.out.println(rndValue);
      
      }// end of the main method
}//end of the class