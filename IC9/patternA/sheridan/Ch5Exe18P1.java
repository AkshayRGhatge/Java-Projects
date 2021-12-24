/*Ch5Exe18P1.java is a program that print the pattern
 * author:Akshay Ghatge
 */
package sheridan;
public class Ch5Exe18P1
{
    public static void main(String[] args)
    {
        System.out.println("Pattern A");
        
           for(int row=1;row<=6;row++) // for loop used to print the row (1-6)
        {
            for(int column=1;column<=row;column++) //for loop used to print the coloumn which is equal to row
            {
                System.out.print(column);
                
            }//end of the nested forloop
            System.out.println("");//print the new line 
        }//end of the for loop
        
        
    }//end of the main method
}//end of the class method