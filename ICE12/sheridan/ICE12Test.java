/* ICE12.java : tests the ICE12 class
 * author : Akshay Ghatge
 */ 
package sheridan;

public class ICE12Test{
     public static void main (String[] args) {
        // Declarations & Initializations
   
        
        // set the name of the dog objects using a public setter
        ICE12 one = new ICE12();
        ICE12 two = new ICE12("Branda",40); 
        // print the name of the dog objects using a public getter
        System.out.println("The name of Dog 1 is: " + one.getName()); 
        System.out.println("The name of Dog 2 is: " + two.getName());  
        
        // Change the name to  Rocky
        one.setName("Rocky"); 
        System.out.println("The name of Dog 1 after change is: " + one.getName());  
        // Change the weight to  20
        two.setWeight(20); 
        System.out.println("The weight of Dog 2 after change is: " + two.getWeight());  
       
        // invoke the methods on the do objects 
        one.bark();
        two.bark();
        
        
        
    }//end of the main method

}//End of the class ICE12Test