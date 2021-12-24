/* Ch1Exe10.java is the program that display the avg speed in miles per hour.
 * author:Akshay Ghatge.
 */
package sheridan;
//Definition of the class Ch1Exe10
public class Ch1Exe10{
    public static void main(String[] args)
    {
        //Declaration of a variable.
        double kilometer=14,minutes=45,second=30,time,avgspeed,mile;
        // Calculating the kilometer into miles
         mile=kilometer/1.6;
        //calculating minutes and second to hour.
         time=((minutes/60)+(second/3600));
         avgspeed=mile/time;
         
        System.out.println("Average speed in miles per hours is:" +avgspeed);
        
    }//end of the main method
}//end of the class Ch1Exe12
