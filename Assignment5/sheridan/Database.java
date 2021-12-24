/*Database.java is a program that sort and print the array element
 *author:Akshay Ghatge
 */
package sheridan;
import java.util.Arrays;//for using arrays 
public class Database
{
   String table[];//array 
   //constructor with array size
   public Database(int size)
   {
       table=new String[size];
   }
   //for sorting
   public void sort()
   {
       Arrays.sort(table); 
   }
   //for addding
   public void add(String item,int index)
   {
     table[index]=item;
   }
   //to print out the array 
   public void print()
   {
      for(int index=0; index < table.length; index++) 
      {
          System.out.println(table[index]);
      }
   }
}//end of the class Database