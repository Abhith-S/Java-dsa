//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//        Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//        Note that multiple kids can have the greatest number of candies.
//
//
//
//        Example 1:
//
//        Input: candies = [2,3,5,1,3], extraCandies = 3
//        Output: [true,true,true,false,true]

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberofCandies {
    public static void main(String[] args) {

        int[] nums  = {2,3,5,1,3};
        int n = 3;
        System.out.println(kidsWithCandies(nums,n));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //boolean arrayList
        List<Boolean> result = new ArrayList<>(candies.length);

        // Find the largest holder
        int largest = 0;

        for (int candy : candies) {
            if (candy > largest) {
                largest = candy;
            }
        }

        // Check if extra enough to be bigger than largest
        for (int candy : candies) {
            result.add((candy + extraCandies) >= largest);
        }

        return result;
    }
}
