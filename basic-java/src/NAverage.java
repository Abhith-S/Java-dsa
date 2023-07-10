import java.util.Scanner;

public class NAverage {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //sum of all numbers till num / total numbers

        int sum=0;
        float average;

        for(int i=1;i<=num;i++){
            sum += i;
        }
        average = sum/num;
        System.out.println("average is "+average);
    }
}
