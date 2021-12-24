/*WhileLoopExe1.java is a program that add the number from 1-100 using while loop
*author:Akshay Ghatge
*/
package sheridan;
public class WhileLoopExe1
{
    public static void main(String[] args)
    {
       //Declaration and Initialization
        int result=0;
        int num=1;
        while(num<=100)//loop to repeat the  1 to 100
        {
            result=result+num;
          
            num++;
                 
        }
         System.out.println("Addition of the number from 1-100:"+result);
    }//end of the main method
}//end of the class method