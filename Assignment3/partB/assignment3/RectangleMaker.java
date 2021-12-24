/*RectangleMaker.java prints rectangles of three different sizes to the screen,
 * with a blank line between each rectangle.
 * author:Akshay Ghatge
 */
package assignment3;
public class RectangleMaker{
    private int _width;//represent the width of the rectangle
    private int _height;//represent the height of the rectangle
    private char _symbol;//represent the character of the rectangle
    
    
    public void setWidth(int newWidth)//setWidth method set the width 
    {
        this._width=newWidth;
    }
    public void setHeight(int newHeight)//setHeight method set the height 
    {
        this._height=newHeight;
    }
     public void setSymbol(char newSymbol)//setSymbol method set the Symbol 
    {
        this._symbol=newSymbol;
    }
    public void printRectangle(){
     //print the rectangle
     //repeat the width from 0 to _width
    for(int iWidth=0; iWidth < this._width; iWidth++)
      {
      //repeat for length from 0 to _length
         for(int iHeight=0; iHeight < this._height; iHeight++)
       {
          System.out.print(this._symbol);
       }
      //create a new line after a current row
         System.out.println("");
  }
    }//end of the printRectangle
    public static void main(String[] args)
    {
     //Decalaration and initialization
        RectangleMaker rect=new RectangleMaker();// _width:0;_height=0;_symbol:(ascii 0)
        RectangleMaker rect1=new RectangleMaker();//creating rect1 object
        RectangleMaker rect2=new RectangleMaker();//creating rect2 object
           
      //use setters to change the properties of the rect to
      //_width:3,_height:4,_symbol:0
      
      rect.setWidth(3);
      rect.setHeight(4);
      rect.setSymbol('0');
      
      //use setters to change the properties of the rect1 to
      //_width:7,_length:14,_symbol:T
      rect1.setWidth(7);
      rect1.setHeight(14);
      rect1.setSymbol('T');
      
      //use setters to change the properties of the rect to
      //_width:5,_height:2,_symbol:[
      rect2.setWidth(5);
      rect2.setHeight(2);
      rect2.setSymbol('[');
      
      
   
     //Draw the rectangle
   
    rect.printRectangle();//calling
    System.out.println("");
    rect1.printRectangle();
    System.out.println("");
    rect2.printRectangle();
    }//end of the main method
    
  
}//end of the class