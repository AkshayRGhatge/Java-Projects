/*Ch5Exe18P3.java is a program that print the pattern
 * author:Akshay Ghatge
 */
package sheridan;
public class Ch5Exe18P3
{
    public static void main(String[] args)
    {
        System.out.println("Pattern C");
   
        for(int row=1;row<=6;row++)// for loop used to print the row (1-6)
        {
            for(int column=1; column<=(6-row); column++)// for loop used to print the space
            {
                    System.out.print(" "); 
            }
            for( int column=1; column<=row; column++)// for loop used to print the coloumn=row
            {
               
                System.out.print(column);
                
            }
            
                System.out.println("");
        }//end of the for loop
    }//end of the main method
}//end of the class