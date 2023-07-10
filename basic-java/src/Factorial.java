//Factorial Program In Java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int factorial = 1;

        //loop reverse , product of esach itereation
        for(int i=num;i>1;i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
