/*Ch5Exe18P4.java is a program that print the pattern
 * author:Akshay Ghatge
 */
package sheridan;
public class Ch5Exe18P4
{
    public static void main(String[] args)
    {
        System.out.println("Pattern D");
        
        for(int row=6;row >=1;row--)// for loop used to print the row (6-1) inverse order
        {
             for(int column=1; column<=6-row; column++)// for loop used to print the space
            {
                    System.out.print(" "); 
            }//end of the nested for loop
            for(int column=1;column<=row;column++)// for loop used to print the column=row
            {
                System.out.print(column);
                
            }//end of the nested for loop
            System.out.println("");
        }//end of the for loop 
    }//end of the main method
}//end of the class