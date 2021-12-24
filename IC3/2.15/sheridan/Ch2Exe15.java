/*Ch2Exe15.java computes geometry distance of two points
 * author:Akshay Ghatge
 */

package sheridan; 
import java.util.Scanner;//use to scan the input
//Definiton of the class Ch2Exe15
public class Ch2Exe15{
    public static void main(String[] args){
        //Declarations & Initailizations
        double x1;
        double y1;
        double x2;
        double y2;
        double distance;
        
      
        Scanner input= new Scanner(System.in);
        
        // input from the keyboard
           System.out.print("Enter x1 and y1 :");
            x1=input.nextDouble();
            y1=input.nextDouble();
            System.out.print("Enter x2 and y2 :");
            x2=input.nextDouble();
            y2=input.nextDouble();
            //calculating geometry distanceof two points
            distance=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            System.out.print("The distance between the two points is:" +distance);
  
       }//end of the main method  
}//end of the class