/*LetterGradeV2.java is the program that take input grade and display in percentage
 * author:Akshay Ghatge
 */

package sheridan;
import java.util.Scanner;//use for input

public class LetterGradeV2{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        String grade;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your grade");
        grade=input.nextLine();
        
        switch(grade)
        {
                //Check the grade value
            case"A+":
                System.out.println("Percentage is between(90-100%)");
            break;
             case"A":
                System.out.println("Percentage is between(90-100%)");
            break;
             case"B+":
                System.out.println("Percentage is between(80-89%)");
            break;
             case"B":
                System.out.println("Percentage is between(75-79%)");
            break;
             case"C+":
                System.out.println("Percentage is between(70-74%)");
            break;
             case"C":
                System.out.println("Percentage is between(60-64%)");
            break; 
            case"D":
                System.out.println("Percentage is between(50-59%)");
            break;
            case"F":
                System.out.println("You are failed");
            break;
             default:
               System.out.println("Invalid Grade");
               break;
        }//end of the switch
        
    }//end of the main method
}//end of the class