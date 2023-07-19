//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//
//
//
//        Example 1:
//
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

//import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts  = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int max=0;

        //2 loops - row and col

        //length of row = length of matrix, ie array.length
        for(int[] row : accounts ) {

            //sum from all accounts
            int sum = 0;

            //length of column = length of that row , ie array[row].length
            for (int col : row) {
                sum += col;
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }


}
