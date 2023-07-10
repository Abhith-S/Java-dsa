import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amount  = sc.nextFloat();
        float amountUsd = amount*89;
        System.out.println(amountUsd);
    }
}
