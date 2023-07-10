import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class ProductAndSum {
    public static void main(String[] args) {

        //take interger inpiut
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int sum = 0, product  = 1,result;

        //extract the digits
        while(num!=0){
            sum += num%10;
            product *= num%10;
            num = num/10;
        }

        result  = product - sum;
        System.out.println(result);

    }

}
