import java.util.Scanner;
public class Histogram{ 
public static void main(String[] args){
        //declaration and initialization
        int count;
        Histogram self=new Histogram();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements you want: ");
        count=input.nextInt();
      
        int[] number=new int[count];
        for(int i=0;i < count;i++){//taking the array input from user
           System.out.print("Enter Element:");
           number[i]=input.nextInt();
            
            if(number[i] < 0 ||  number[i] > 10){
              System.out.println("Bad Input! please enter number between 0 and 10.");   
              number[i]=input.nextInt();
            }
       
        }
        self.printHistogram(number,count);
    }//end of main method
    
//declaration and definition of another method
public void printHistogram(int[] number,int count){
 for(int i=0;i<count;i++ )
 {
     System.out.print("Element"+(i+1));
   for(int j=0;j<number[i];j++)
   {
       System.out.print("*");
   }
   System.out.println();
 }
    
}//end of printHistogram
}// of class Histogram