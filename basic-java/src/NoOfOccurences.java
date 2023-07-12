import java.util.Scanner;

public class NoOfOccurences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        System.out.print("check occurrences of : ");
        int checkNum = input.nextInt();

        int occurrence = 0;
        long rem;

        while(num != 0){
            rem = num %10;
            if(rem == checkNum){
                occurrence++;
            }
            num /= 10;
        }
        System.out.println(occurrence);
    }
}
