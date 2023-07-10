import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
