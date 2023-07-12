import java.util.Scanner;

//Define two methods to print the maximum and
// the minimum number respectively among three numbers entered by the user.
public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(),num2 = input.nextInt(),num3 = input.nextInt();
        System.out.println(minNum(num1,num2,num3));
        System.out.println(maxNum(num1,num2,num3));
    }

    public static int minNum(int a , int b, int c) {
        int min = a;
        if(b<min){
            min = b;
        }if(c<min){
            min = c;
        }
        return min;
    }

    public static int maxNum(int a ,int b, int c){
        int max =a;
        if(b>max){
            max = b;
        }if(c>max){
            max = c;
        }

        return max;
    }
}
