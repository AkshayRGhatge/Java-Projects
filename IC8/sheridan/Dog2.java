/*Dog2.java is a program that shows, if the weight < 30 represent small dog bark and vice versa
 * author:Akshay Ghatge
 */
package sheridan;
public class Dog2{
    private int _weight;// field Variable
    public void setWeight(int weight)//represent the set
    {
        _weight=weight;
       
    }
    public void bark()// bark() method
    {
        // if condition to check the weight is less than 30 represent the small dog else big dog
         if(_weight<30){
            System.out.println("Small dog weight: " +_weight+ " Yip Yip!!!");//represent the Small dog bark weight less than 30
          }
         else
         {
             System.out.println("Big dog weight: "+_weight+" Woof Woof!!!");//represent the Big dog bark weight more than 30
         }
    }//end of the bark method
    public static void main (String[] args){
    //Decalaration and Initialization
    Dog2 one =new Dog2();
    one.setWeight(35);
    Dog2 two=new Dog2();
    two.setWeight(20);
    one.bark();//invoking bark method
    two.bark();//invoking bark method
    }//end of the main method
}//end of the class method