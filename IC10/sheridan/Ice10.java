/*Ice10.java is a program that print the month of the respected number when user input
 *author:Akshay Ghatge
 */
package sheridan;
import java.util.Scanner;//use for input
public class Ice10
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        Scanner input=new Scanner(System.in);
        Ice10 self=new Ice10();
        int userInput;
        System.out.println("Please enter the number to know months");
        userInput=input.nextInt();
           
        //calling numTOMonth method
        self.numToMonth(userInput);      
          
    }//end of the static method
    public int numToMonth(int monthNum)
    {
        //Declaration of the array
        String[] monthName={"January","February","March","April","May","June","July","August","September","October","November","December"};
         System.out.println("monthNumber["+monthNum+"]:"+monthName[monthNum-1]);//output
         return monthNum-1;
    }//end of the numToMonth method
}//end of the classS