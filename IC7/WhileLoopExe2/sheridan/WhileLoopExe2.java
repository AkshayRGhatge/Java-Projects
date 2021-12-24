/*WhileLoopExe2.java is a program that write your name till the number you input using the while loop
 * author:Akshay Ghatge
 */   
package sheridan;
import java.util.Scanner;//Scanner 
public class WhileLoopExe2
{
    public static void main(String[] args)
    {
        //Declaration and Initialization   
        int number;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to display how many times you have to display your name");
        number=input.nextInt();
        //Declaration and Initialization
        int lineNo=1;
        while(lineNo<=number)//while loop use to count the number that user want to diplay the name
        {
              System.out.println("Akshay Ghatge");
            lineNo++;
        }
     
    }//end of the main method
}//end of the class