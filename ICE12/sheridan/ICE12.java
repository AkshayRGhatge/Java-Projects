package sheridan;

public class ICE12 {

   
    private String _name; // represent the name of dog
    private double _weight; // represent the weight of a dog
    
    //constructor
    public ICE12(){
        this("Bravo",30);
    }
    //ICE12 constructor initializes the 
    //  radius to rad , the color to col
   
     public ICE12(String name,double wei){
        this._name=name;
        this._weight=wei;
    }
      // setter and getter 
    public void setName(String newName) {
        _name = newName;
   }
    public String getName(){
          return _name;   
    }
   
  public void setWeight(double newWeight) {
        
       
           // represent  the weight to the object
           _weight = newWeight;
        
    }
        
    public double getWeight(){
          return _weight;   
    }
     public void bark() {
                 
         if ( _weight <= 30 ){ // small dog if _weight < 30
             System.out.println(_name + " is a small dog.");
           }
         else if(_weight > 30){ // otherwise a big dog
              System.out.println(_name + " is a big dog.");
              }
        
    }//end of the bark
   
} // End of class ICE12
