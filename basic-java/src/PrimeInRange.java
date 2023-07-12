import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //range
        int lowerLimit = input.nextInt();
        int upperLimit = input.nextInt();
        getPrimes(lowerLimit,upperLimit);
    }

    public static void getPrimes(int lowerLim,int upperLim){
        boolean isPrime ;

        for(int i=lowerLim+1; i<upperLim; i++){
            isPrime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){

                System.out.println(i);
            }
        }
    }
}
