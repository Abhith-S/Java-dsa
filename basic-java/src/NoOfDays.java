import java.util.Scanner;

//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class NoOfDays {
    public static void main(String[] args) {

        //august has 31 days
        //get no of even numbers till 31

        int count = 0;

        for(int i=2;i<31;i++){
            if(i % 2 ==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
