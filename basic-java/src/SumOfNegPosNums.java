import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

public class SumOfNegPosNums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take input until 0 entered
        int negSum,oddSum,evenSum,num=1,initial =0;
        negSum = oddSum = evenSum = initial;

        while(num != 0){
            num = input.nextInt();
            if(num<0){
                negSum += num;
            }else if(num % 2== 0){
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        System.out.println("Negative "+negSum+"\n"+"Even "+evenSum+"\n"+"Odd "+oddSum);
    }
}
