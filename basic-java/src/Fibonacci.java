import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        int fiboFirst = 0, fiboSecond = 1, fiboNew, i, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        n = sc.nextInt();

        if (n == 0) {
            System.out.println(fiboFirst);
        } else if (n == 1){
            System.out.println(fiboFirst);
            System.out.println(fiboSecond);
    }else{
            System.out.println(fiboFirst);
            System.out.println(fiboSecond);
        for (i = 0; i < n - 2; i++) {
            fiboNew = fiboFirst + fiboSecond;
            System.out.println(fiboNew);
            fiboFirst = fiboSecond;
            fiboSecond = fiboNew;
        }
    }
    }
}
