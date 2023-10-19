//find the ceiling of a target num from the array
public class Ceiling {
    public static void main(String[] args) {
        int num =5;
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(findCeiling(num,arr));
    }

    static int findCeiling(int num, int[] arr){

        //we do binary search for a number grater than or equal to num
        int start=0,end=arr.length-1;

        while(start<= end) {

             int mid = (start + end) / 2;

            if (arr[mid] == num) {
               return mid;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}
