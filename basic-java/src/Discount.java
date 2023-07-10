import java.util.Scanner;

//Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        float discountPercentage = input.nextFloat();
        float price = input.nextFloat();

        //discount is in % of total price

        float discount = (price * discountPercentage)/100;
        System.out.println(discount);
    }
}
