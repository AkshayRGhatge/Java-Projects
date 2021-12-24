/*PartA.java is a porgram that  inputs an unspecified number of integers from the user. 
 * The program calculate some simple statistics about the numbers,
 * author:Akshay Ghatge
 */
package assignment3;
import java.util.Scanner;//user to enter
public class PartA
{
         
    public static void main(String[] args)
    {
        //Declaration and Initialization
           int count=0;
           int sum=0;
           double average;
           int maximumValue=0;
           int minimumValue=0;
           int negativeValues=0;
           int positiveValues=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter one or more integer:");
        int number;
        do{//do loop to check if user enter value not equal 0 and calculate some operation if condition satisfied 
            number=input.nextInt();//letting user enter number and store in number
            sum= sum + number;//calculating the total
            if(number > 0)// if condition used to count the count which is greater than 0
            {
            count++;
            }//if condition end
           
         if(number > 0){//if condition to check the total positive value
             
             positiveValues++;
         }
         else if(number < 0){//elseif statement check the negative values
             negativeValues++;
         }
           if(number < minimumValue )//if condition to obtain the minimum value enter
         {
             minimumValue=number;
         }
         else if(number > maximumValue )//else if condition to obtain the maximum value enter
         {
             maximumValue=number;
         }
          average=(double)sum/(double)count;// for calculating average
        }while(number !=0);
                                
        
          
        System.out.println("The total of all number is:"+sum);
        System.out.println("The average of all number is:"+average);
        System.out.println("The number of positive values is:"+positiveValues);
        System.out.println("The number of negative values is:"+negativeValues);
        System.out.println("The highest number entered is:"+maximumValue);
        System.out.println("The lowest number entered is:"+minimumValue);
        
      
    }//end of the main method
}// end of the class