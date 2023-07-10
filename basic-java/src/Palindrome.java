import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.next();

        String newStr = "";

        //reverse the string
        for(int i = str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(newStr);
        if(str.equals(newStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
