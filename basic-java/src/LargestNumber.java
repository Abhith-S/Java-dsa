import java.util.Scanner;

//largest among 3 numbers
public class LargestNumber {
    public static void main(String[] args) {

        //take 3 numbers as input
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        //assume a number is largest and compare
        int largestNumber;


        //method 1
//        if (num2 > num1) {
//            largestNumber = num2;
//            if (num2 > num3) {
//                largestNumber = num2;
//            } else {
//                largestNumber = num3;
//            }
//        } else if (num3 > num1) {
//            largestNumber = num3;
//        }


        //method 2
        //largestNumber = num1;
//        if(num2 > num1){
//            largestNumber = num2;
//        }
//        if(num3 > num1){
//            largestNumber = num3;
//        }


        //method 3
        //using Math.max(a,b)
        largestNumber = Math.max(Math.max(num1, num2), num3);

        System.out.println(largestNumber);


    }
}
