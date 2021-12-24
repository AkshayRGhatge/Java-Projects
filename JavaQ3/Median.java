import java.util.Scanner;
import java.util.Arrays;//to use tostring method

public class Median
{
    //public static final double ARRAY_SIZE=7;

    public static void main(String args[])

    {

       double[] num =new double[7];

       Scanner input =new Scanner(System.in);

       Median self = new Median();

       System.out.print("Enter numbers to find middle number amoung them:");

       num = input.nextDouble();

     

       //invoking method calcMedian

       double result=self.calcMedian(num);

       System.out.println("Middle number is:"+result);

    }//end of main method

    //declaration of calcMedian method

    public double calcMedian(double[] number)

    {

        //sorting array

        Arrays.sort(number);

        //print sorted array

        System.out.println("Sorted array is:"+Arrays.toString(number));

        //find middle number

        double median;

        if (number.length % 2 == 0)

        {

            median = ((double)number[number.length/2] + (double)number[number.length/2 - 1])/2;

        }   

        else

        {

            median = (double) number[number.length/2];

        }

        return median;

    }

}