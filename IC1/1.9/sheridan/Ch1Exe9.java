/* Ch1Exe9.java is the program that calculate the area and perimeter of a rectangle.
 * author:Akshay Ghatge.
 */
package sheridan;
// Definition of the Ch1Exe9
public class Ch1Exe9{
    
    public static void main(String[] args)
    {
        //Declaration and intialization
        double area,perimeter,width,height;
        
        width=4.5;//intialization width to 4.5
        height=7.9;//initalization height to 7.9
        //calculate area of a rectangle
        area=width*height;
        //calculate perimeter of a rectangle
        perimeter=2*(width+height);
        System.out.println("Area of the Rectangle"+area);
        System.out.println("Perimeter of the Rectangle"+perimeter);
    }//end of the main method
}//end of the Ch1Exe9