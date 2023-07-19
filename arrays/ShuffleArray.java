//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//
//        Example 1:
//
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;

public class ShuffleArray {
        public static void main(String[] args) {

            int[] nums  = {2,5,1,3,4,7};
            int n = 3;
            System.out.println(Arrays.toString(shuffle(nums,n)) );
        }
        public static int[] shuffle(int[] nums, int n) {

            // int[] result = new int[2*n];

            // //loop till half but do 2 storing in an iteration
            // for(int i=0; i<n; i++){

            //     //at even position
            //     result[i*2] = nums[i];

            //     //at odd position
            //     result[(i*2)+1] = nums[i+n];
            // }
            // return result;

            //OR

            //OPTIIZED solution
            //storing 2 numbers in single number
            //storing a+b*10 in right side

            //here i am setting max according to test cases
            int max = 10000;

            for(int i=n;i<nums.length;i++){
                nums[i] = nums[i-n] + nums[i]*max;
            }

            //now ectract and store elements
            int index =0;
            for(int i=n; i<nums.length; i++){
                nums[index] = nums[i] % max;
                nums[index+1] = nums[i]/max;
                index += 2;
            }

            return nums;



        }
    }


