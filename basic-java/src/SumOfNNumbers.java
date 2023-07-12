import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit = input.nextInt();

        System.out.println(getSum(limit));
    }

    public static int getSum(int limit){
        int sum = 0;
        for(int i=1;i<=limit;i++){
            sum += i;
        }
        return sum;
    }
}
