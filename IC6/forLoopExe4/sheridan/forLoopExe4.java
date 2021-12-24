/*forLoopExe4.java is a program that print out the number from 100 to 3000 which are divisible by 23
 * author:Akshay Ghatge
 */   
package sheridan;
public class forLoopExe4
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
       int count=0;//represent the count of number divisible by 23
        
        for(int lineNo=100;lineNo<=3000;lineNo++)//for loop use to count number from 100 to 3000
        {
            if((lineNo%23)==0)//condition to check the number divisible by 23
            {
                //update the count
                count=count+1;
                System.out.println("Divisible of the numbers from 100 to 3000:"count +"."+lineNo);
                
            }
                 
        }
     System.out.println("The count of the number :"+count);
    }//end of the main method
}//end of the class