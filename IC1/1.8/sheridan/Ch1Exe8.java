/* Ch1Exe8.java is the program that calculate the area and perimeter of a circle.
 * author:Akshay Ghatge.
 */
package sheridan;
//Definition of the class Ch1Exe8
public class Ch1Exe8{
    
    public static void main(String[] args)
    {
        //Declaration and initialization
        double area,perimeter,radius;
        
        radius=5.5;//initailization radius to 5.5 
        //calculate perimeter of a circle
        perimeter=2*radius*3.14;
        //calculate area of a circle.
        area=radius*radius*3.14;
        System.out.println("Area of a circle is" +area);
        System.out.println("Perimeter of a circle is" +perimeter);
        
    }//end of the main method
}//end of the class Ch1Exe8