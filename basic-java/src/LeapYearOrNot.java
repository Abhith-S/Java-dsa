import java.util.Scanner;

//Check Leap Year Or Not
public class LeapYearOrNot {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //conditions for leap year
        // Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
        //Check if the year is divisible by 400, DISPLAY "leap year"
        // Otherwise, DISPLAY "not leap year"

        if(year % 4 == 0 && year % 100 != 0){
                System.out.println("Leap");
            }else if(year%400 == 0){
                    System.out.println("Leap");
                }else{
                    System.out.println("Not leap");
                }

    }
}
