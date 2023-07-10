import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Factors {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //factors can divide a number fully , remainder 0 , and is less than the number itself

        System.out.println(1);

        for(int i=2; i<num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }

        System.out.println(num);


    }
}
