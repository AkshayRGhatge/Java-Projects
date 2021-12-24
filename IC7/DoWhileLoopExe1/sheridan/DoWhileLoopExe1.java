/*DoWhileLoopExe1.java is a program that add the addition from 1 to 100 using do while loop
 * author:Akshay Ghatge
 */

package sheridan;
public class DoWhileLoopExe1
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        int result=0;
        int num=1;
        do//do while loop is used to repeat the loop from 1 to 100
        {
            result=result+num;
          
            num++;
                 
        }while(num<=100);
         System.out.println("Addition of the number from 1-100:"+result);
    }
}