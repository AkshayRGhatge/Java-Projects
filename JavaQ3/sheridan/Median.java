/*Median.java is a program that calculate the median
 * author:Akshay Ghatge
 */    
package sheridan;
import java.util.Scanner;//use for input
import java.util.Arrays;//use for arrays
   
public class Median{
 
    public static void main(String[] args){
     int[] number;
       Scanner input =new Scanner(System.in);
       Median self = new Median();
       double userInput;
       System.out.print("Enter numbers to find median:");
       userInput = input.nextDouble();
       number=new int[userInput];
      //invoke method calcMedian

       double result=self.calcMedian(number);

       System.out.println("Median is:"+result);
     
     
    }//end of the main method          
   public double calcMedian(double[] number)
    {
       Arrays.sort(number);//to sort
       System.out.println("Sorted array is:"+Arrays.toString(number)); //print sorted array
        //find median number
        double median;
        if (number.length % 2 == 0)//for even input
        {
           median = (double) number[number.length/2];
        }   
        else
        {
         median = ((double)number[number.length/2] + (double)number[number.length/2 - 1])/2;
        }
        return median;
        
    }//end of the calcMedian
}//end of the class