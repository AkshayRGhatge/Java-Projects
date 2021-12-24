/*forLoopExe2.java is a program that write your name till the number you input 
 * author:Akshay Ghatge
 */   
package sheridan;
import java.util.Scanner;
public class forLoopExe2
{
    public static void main(String[] args)
    {
        int number;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to display how many times you have to display your name");
        number=input.nextInt();
        //Declaration and Initialization
    
        for(int lineNo=1;lineNo<=number;lineNo++)//for loop use to count the number that user want to diplay the name
        {
              System.out.println("Akshay Ghatge");
            
        }
     
    }//end of the main method
}//end of the class