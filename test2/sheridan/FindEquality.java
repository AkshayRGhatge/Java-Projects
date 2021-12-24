/*FindEquality.java is a program that check the two positive number value and print the boolean value if they are equal
 *author:Akshay Ghatge 
 */

package sheridan;
import java.util.Scanner;//use for getting input
public class FindEquality
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        int oneInput;
        int twoInput;
        boolean result;
        Scanner input=new Scanner(System.in);
        FindEquality self=new FindEquality();//create an object variable
        System.out.print("Enter First Integer Value");
        oneInput=input.nextInt();
        System.out.print("Enter two Integer Value");
        twoInput=input.nextInt();
                   
        
        result=self.isEqual(oneInput,twoInput);//calling isEqul() method
    }// end of the main method
    public boolean isEqual(int oneIn,int twoIn)
    {
        boolean isValid=true;
        boolean notValid=false;
       
       
        if(oneIn == twoIn)//if statement condition to check the value are equal or not
        {
           System.out.println(isValid);//print true if equal
        }
        else
        {
            System.out.println(notValid);//print false if not equal
        }
        
        
      
       return isValid;
    }//end of the isEqual method
}//end of the class