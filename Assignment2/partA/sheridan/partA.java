/*partA.java is a program that let the user enter the dice value from (1-6) and print the result according to dice value
 * author:Akshay Ghatge
 */
package sheridan;
import java.util.Scanner;//use to scan input
public class partA
{
    public static void main(String[] args)
    {
        //Declaration and Initalization
        System.out.println("please enter a dice value from 1 to 6");
        int userKey;
        Scanner input=new Scanner(System.in);
        userKey=input.nextInt();
     
        switch(userKey)//use switch statement to print the dice value when user enter value from 1-6
        {
            case 1:
                System.out.println("o");
                break;
            case 2:
                System.out.println("o");
                System.out.println(" ");
                System.out.println(" o");
                break;
            case 3:
                System.out.println("o");
                System.out.println(" o");
                System.out.println("  o");
                break;
            case 4:
                System.out.println("o   o");
                System.out.println("     ");
                System.out.println("o   o");
                break;
            case 5:
                System.out.println("o   o");
                System.out.println("  o ");
                System.out.println("o   o");
                break;
            case 6:
                System.out.println("o   o");
                System.out.println("o   o");
                System.out.println("o   o");
                break;
            default:
                System.out.print("Invalid Input");
                
        } //end of the switch statement                                                                                                                               
    }//end of the main method
}//end of the class