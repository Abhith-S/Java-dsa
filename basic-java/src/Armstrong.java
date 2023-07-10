import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
        //take 2 numbers input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lower limit and Upper limit : ");
        int lowerLimit = sc.nextInt(), upperLimit = sc.nextInt();

        armstrong(lowerLimit, upperLimit);
    }

    public static void armstrong(int lowerLimit, int upperLimit) {
        //loop from lower to upper
        for (int i = lowerLimit; i < upperLimit; i++) {
            //set i to num
            int num = i;
            int sum = 0;

            //check if num is armstrong
            while (num > 0) {
                //extract digits
                int remainder = num % 10;
                sum += (remainder * remainder * remainder);
                num = num / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
