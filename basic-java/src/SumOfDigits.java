import java.util.Scanner;

//Sum Of A Digits Of Number
public class SumOfDigits {
    public static void main(String[] args) {
        //take integer input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum = 0, rem;
        //extract digits and calculate sum

        while(num != 0){
            rem = num%10;
            sum += rem;
            num /= 10;
        }

        System.out.println(sum);
    }
}
