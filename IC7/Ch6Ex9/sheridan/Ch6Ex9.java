/*Ch6Ex9.java is a program that convert feet to meter and meter to feet
 *author:Akshay Ghatge
 */
package sheridan;
public class Ch6Ex9
{
    public static void main(String[] args)
    {
        //Declaration and Initialization
        double mtr;
        double feet;
        Ch6Ex9 self=new Ch6Ex9();// create self object
        mtr=self.footToMeter();//call footToMeter()
        feet=self.meterToFoot();//call meterToFoot()
        
    }//end of the main method
    public double footToMeter()
    {
        double meter=0;
        System.out.println("Foot        Meter");
        for(double foot=1;foot<=10;foot++)//For loop used to repeat the loop from 1 to 10
        {
        meter=0.305 * foot;
       
        System.out.print(foot+"    |    ");
        System.out.printf("%.3f %n",meter);
        }
        return meter;
    }//end of the footToMeter
   public double meterToFoot()
    {
        double foot=0;
        System.out.println("Meter       Foot");
        for(double meter=1;meter<=10;meter++)//for loop used to repeat the loop from 1 to 10 
        {
       
        foot=3.279 * meter;
        System.out.print(meter+"    |    ");
        System.out.printf("%.3f %n",foot);
        }
        return foot;
    }//end of the meterToFoot
   
   
}//end of the class method