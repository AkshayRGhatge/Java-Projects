/* Ch1Exe11.java is the program that display the population in each next five year.
 * author:Akshay Ghatge.
 */
package sheridan;
//Definition of the class Ch1Exe11
public class Ch1Exe11{
    public static void main(String[] args)
    {
        //Declaration of a variable.
        double birth=7,death=13,immigrant=45,population=312032486,hour,second,convsectohr,day,bhr,dhr,imghr,year;
        double secondyear,thirdyear,fouryear,fiveyear;
        // Calculating the birth in hour
         bhr=(365*24*3600)/7;
        //calculating death in hour.
         dhr=(365*24*3600)/13;
         //calculating the immigrant in hour
         imghr=(365*24*3600)/45;
         //calculating the population in one year
         year=population+bhr+imghr-dhr;
         // caculating the populationin second year
         secondyear=year+bhr+imghr-dhr;
         // caculating the populationin third year
         thirdyear=secondyear+bhr+imghr-dhr;
         // caculating the populationin four year
         fouryear=thirdyear+bhr+imghr-dhr;
         // caculating the populationin five year
         fiveyear=fouryear+bhr+imghr-dhr;
         
         
        System.out.println("The population for 1 year is" +year);
        System.out.println("The population for 2 year is" +secondyear);
        System.out.println("The population for 3 year is" +thirdyear);
        System.out.println("The population for 4 year is" +fouryear);
        System.out.println("The population for 5 year is" +fiveyear);
       
    }//end of the main method
}//end of the class Ch1Exe12
