//Write a function to check if a given triplet is a Pythagorean triplet
// or not. (A Pythagorean triplet is when the sum of the square
// of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(checkPythagoreanTriplet(num1,num2,num3));
    }
    public static boolean checkPythagoreanTriplet(int a,int b, int c){
        return (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2);
    }
}
