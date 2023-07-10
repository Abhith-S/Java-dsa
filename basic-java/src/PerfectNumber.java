//Perfect Number In Java
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //perfect num : num == sum of its divisors excluding itself

        int sum=0;

        //find all divisors of num
        for(int i=1;i<num;i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not perfect number");
        }
    }
}
