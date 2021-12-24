/*forLoopExe1.java is a program that add the result of 1 to 100
 * author:Akshay Ghatge
 */   
package sheridan;
public class forLoopExe1
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        int result=0;
        for(int lineNo=1;lineNo<=100;lineNo++)//for loop use to add number from 1 to 100
        {
            result=result+lineNo;
            
        }
        System.out.println("Addition of the numbers is:"+result);
    }//end of the main method
}//end of the class