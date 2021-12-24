/*Random1B.java is a program that generate a random number from 15.0 to 20.0
 * author:Akshay Ghatge
 * */
package sheridan;
import java.util.Random;
public class Random1B{
    public static void main(String[] args)
    {
        //Declaration and Initalization
        Random rnd=new Random();
        float rndValue;
        rndValue=15 + rnd.nextFloat()+rnd.nextInt(5); 
        
       System.out.println(rndValue);
      
      }//end of the main method
}//end of the class