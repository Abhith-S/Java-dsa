//Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

public class NumberofGoodPairs {
    public static void main(String[] args) {

        int[] nums  = {1,2,3,1,1,3};
        System.out.println( numIdenticalPairs(nums));


    }

    static int numIdenticalPairs(int[] nums) {

        //BRUTE FORCE

        // int count =0;

        // for(int i=0;i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j] && i<j){
        //             count++;
        //         }
        //     }
        // }
        // return count;


        //OPTIMIZED

        //find the no of occurences of each number in array nums and create a frequency array with counts
        //101 is given by checking question constraints

        int[] frequencyArray = new int[101];
        for(int num : nums){
            frequencyArray[num]++;
        }

        //now use nCr to find number of 2 pairs combinations
        //ncr = n!/()r!(n-r)!)
        //here r=2 so nC2 = n(n-1)(n-2)! / 2*(n-2)!
        //ie nC2 = n(n-1)/2

        int count = 0;

        for(int n : frequencyArray){
            count += (n*(n-1))/2;
        }

        return count;

    }
}
