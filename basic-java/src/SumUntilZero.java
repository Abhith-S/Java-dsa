//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);

        int num=1,sum=0,largest=0;

        while(num!=0) {
            num = input.nextInt();
            //sum += num;
            if(num > largest){
                largest = num;
            };
        }
        //System.out.println(sum);
        System.out.println(largest);


    }
}
