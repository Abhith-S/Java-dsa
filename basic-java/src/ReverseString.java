//Reverse A String In Java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        String str = input.next();

        String newStr = "";

//        for(int i=str.length()-1;i>=0;i--){
//           newStr += str.charAt(i);
//        }

        //OR
        //using StringBuilder

        StringBuilder sb = new StringBuilder(str);
        newStr = sb.reverse().toString();


        System.out.println(newStr);
    }
}
