/*DatabaseTester.java is use to test the program
 *author:Akshay Ghatge
 */
package sheridan;
import java.util.Scanner;//use for input
public class DatabaseTester
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        Scanner input=new Scanner(System.in);
        try
        {
            System.out.println("Enter the table size:");
            int userNum=input.nextInt();
            input.nextLine();
            Database self=new Database(userNum);
            for(int index=0;index<userNum;index++)
            {
                System.out.println("Enter the element");
                String item=input.nextLine();
                self.add(item,index);
            }
            self.print();//calling the print()
            self.sort();//calling the sort()
            System.out.println("Sorted Array is:");
            self.print();//calling the print()
        }
        catch (NumberFormatException  e)
        {
            System.out.println("Invalid input");
        }
    }
}//end of the DatabaseTester