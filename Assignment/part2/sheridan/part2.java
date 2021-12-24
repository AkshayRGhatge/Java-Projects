/*Example:This program display the whole number into individual digits.
* author:Akshay Ghatge
*/
package sheridan;
import java.util.Scanner;
//Definition of the class part1
public class part2{
    public static void main(String[] args){
        //Declaration and Initializations
        int a,b,c,d,e,f,g,h;
        Scanner input= new Scanner(System.in);// userinput
        System.out.print("Enter the four digit number");
        a=input.nextInt();
        
        b=a/1000;//print first digit
        c=a-b*1000;
        d=c/100;//print second  digit
        e=c-d*100;
        f=e/10;//print third  digit
        g=e-f*10;//print forth digit
        System.out.print(b+"   " +d+"   "+f+"   "+g);
        
       
    }//end of the main method
}//end of the class program