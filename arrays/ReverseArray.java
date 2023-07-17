import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //declare array
        int[] arr = {12,3,2,4,23};

        System.out.println(Arrays.toString(reverse(arr)) );

    }

    static int[] reverse(int[] arr){

        int start=0,end=arr.length-1,temp;

        //logic is run loop until start is greater than end
        while(start<end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        
        return arr;
    }

 }
