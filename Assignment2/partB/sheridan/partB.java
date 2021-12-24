/*partB.java is a program that count the number of head and tails from 10
 * author:Akshay Ghatge
 */

package sheridan;
import java.util.Random;// use for the random 
public class partB
{
    private int headCounter=0;// to count the total heads
    private int tailCounter=0;//to count the total tails
    public static void main(String[] args)
    {
        partB self=new partB();
      
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
          self.calculation();
         
            
                
              System.out.println("The number of the heads is" +self.headCounter);
              System.out.println("The number of the Tails is"+self.tailCounter); 
    }//end of the main method 
        

    public void calculation()
    {
        Random rnd=new Random();
        double rndValue; 
        rndValue=rnd.nextDouble()+rnd.nextInt(1);
      
        if(rndValue>0.5)//if loop to check if value is greater than 0.5
        {
            System.out.println("Head");
              headCounter=headCounter+1;
      
           
        }
        else
        {
            System.out.println("Tail");
              tailCounter=tailCounter+1;
        }
      
    }//end of the calculation  method
    
}//end of the class