/*LetterGradeV1.java is a program that takes grade as a input and display  percentage scale
 * author:Akshay Ghatge
 */
package sheridan;
import java.util.Scanner;//used for input
public class LetterGradeV1 {
    public static void main(String[] args)
    {
        //Declaration and initialization
        
        String letter;//represent the grade which is (0-100)%
        Scanner input=new Scanner(System.in);
        //input
        System.out.print("Enter the letter beetween(D-A:)");
        letter=input.nextLine();
        
        //check the range  grade
        if(letter.equals("A+"))
        {
            System.out.println("90-100%");
        }
        else if(letter.equals("A"))
        {
            System.out.println("80-90%");
        }
               else if(letter.equals("B+"))
        {
            System.out.println("75-79%");
        }
                            else if(letter.equals("B"))
        {
            System.out.println("70-74");
        }  else if(letter.equals("C+"))
        {
            System.out.println("65-69%");
        }
        else if(letter.equals("C"))
        {
            System.out.println("50-64%");
        }
        else if(letter.equals("D")){
                  System.out.println("failed");
          }
        else
        {
           System.out.println("Invalid number");
        }
    }}             