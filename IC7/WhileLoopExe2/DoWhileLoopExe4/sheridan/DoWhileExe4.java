/*DoWhileExe4.java is a program that generate the random number greater than 0.99 using dowhile loop
 * author:Akshay Ghatge
 */

package sheridan;
import java.util.Random;// use for the random 
public class DoWhileExe4
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        Random rnd=new Random();
        double rndValue;//represent the random value between 0 to 1
        rndValue=rnd.nextDouble();
        do//repeat the loop forever
        {
            if(rndValue >=0.99)//if condition to check the rndValue greater than 0.99
            {
                System.out.println("The random value is(>0.99)"+ rndValue);
                
                break;//stop the loop 
            }
           
                rndValue =rnd.nextDouble();
            
        }while(true);
    }
}