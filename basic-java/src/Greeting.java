import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello "+name);

    }
}
