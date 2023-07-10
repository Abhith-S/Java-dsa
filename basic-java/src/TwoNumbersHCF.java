//HCF Of Two Numbers Program
import java.util.Scanner;

public class TwoNumbersHCF {
    public static void main(String[] args) {
        //take integer input
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //find the min number
        int min = num1,hcf=1;
        if(num2<num1){
            min = num2;
        }
        //System.out.println("min is "+min);

        for(int i = 2;i<=min;i++){
            if(num1%i == 0 && num2%i ==0){
                hcf = i;

            }

        }
        System.out.println("hcf is "+hcf);


    }
}
