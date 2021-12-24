/* Ch1Exe12.java is the program that display the avg speed in km per hour.
 * author:Akshay Ghatge.
 */
package sheridan;
//Definition of the class Ch1Exe12
public class Ch1Exe12{
    public static void main(String[] args)
    {
        //Declaration of a variable.
        double mile=24,hour=1,minutes=40,second=35,time,avgspeed,kilometer;
        // Calculating the mile into kilometer
         kilometer=mile*1.6;
        //calculating minutes and second to hour.
         time=hour+((minutes/60)+(second/3600));
         avgspeed=kilometer/time;
         
        System.out.println("Average speed in Kilometers per hours is:" +avgspeed);
        
    }//end of the main method
}//end of the class Ch1Exe12
