public class MaxValue {
    public static void main(String[] args) {
        //define array
        int[] arr = {12,31,5,1,6,13};
        System.out.println(max(arr));
    }
     static int max(int[] arr){
        int maxNum = arr[0];
        for(int num : arr){
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
     }

}
