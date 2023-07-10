//Find if a number is palindrome or not
import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //num - reverse of num == 0

        int rem ,revNum = 0, temp = num;

        //reverse the num
        //extract digits
        while(num != 0){
            rem = num%10;
            revNum = (revNum*10) + rem;
            num /= 10;
        }

        if(revNum == temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
