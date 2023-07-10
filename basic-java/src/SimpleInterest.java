import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        //si = prt/100
        Scanner input = new Scanner(System.in);

        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();

        float si = (p+r+t)/100;
        System.out.println("simple interest "+si);

    }
}
