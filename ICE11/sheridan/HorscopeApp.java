package sheridan;
import java.util.Scanner;
public class HorscopeApp{
    public static void main(String[] args)
    {
        HorscopeApp self=new HorscopeApp();
        Scanner input=new Scanner(System.in);
        String[] prediction;
        String userPrediction;
       
        while(true){
         System.out.println("Please enter what your prediction and enter 'done' when preediction completed");
            userPrediction=input.nextLine();
           
            if(userPrediction.equals("done"))
            {
                break;
            }
            
        }
        
    }
}