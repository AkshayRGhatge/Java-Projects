package application;

//declaration of class Vector2D

public class Vector2D 

{
    //field variable

    private Double _x;

    private Double _y;

   

    //parameter consturctor

     public Vector2D(Double x,Double y)

     {

         this._x=x;

         this._y=y;

     }//end of constructor

     //method to calculate magnitude

     public Double magnitude(Double x,Double y)

     {

         return Math.sqrt(x*x + y*y);

     }//end of method magnitude

}//end of class