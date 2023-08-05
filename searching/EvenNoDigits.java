//lc 1295
//Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.

public class EvenNoDigits {
    public static void main(String[] args) {

        int[] nums  = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {

        //increase a count if even digits
        int count = 0;
        for(int num : nums)    {
            if(hasEvenDigits(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean hasEvenDigits(int num){

        int count=0;

        //if number is negative, make it piositive
        if(num < 0){
            num *= -1;
        }

        if(num == 0){
            return false;
        }

        while(num > 0){
            count++;
            num /= 10;
        }

        return((count%2) == 0);
    }
}
