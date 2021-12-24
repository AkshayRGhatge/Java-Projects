/*DoWhileLoopExe2.java is a program that write your name till the number you input using do while loop
 * author:Akshay Ghatge
 */   
package sheridan;
import java.util.Scanner;//use for input
public class DoWhileLoopExe2
{
    public static void main(String[] args)
    {
        int number;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number to display how many times you have to display your name");
        number=input.nextInt();
        //Declaration and Initialization
        int lineNo=1;
        do//do loop use to count the number that user want to diplay the name
        {
              System.out.println("Akshay Ghatge");
            lineNo++;
        }while(lineNo<=number);
     
    }//end of the main method
}//end of the class