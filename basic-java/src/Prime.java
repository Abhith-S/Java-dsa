import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num){
        //not divisible by any number other than 1 and itself
        boolean prime = true;
        for(int i=2;i<=num/2;i++){
            if(num % i ==0){
                return false;
            }
        }
        return prime;

    }
}
