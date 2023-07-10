import java.util.Scanner;

//LCM Of Two Numbers
public class TwoNumbersLCM {
    public static void main(String[] args) {

        //take integer input
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //least common multiple
        //lcm(a,b) = (a*b)/hcf(a,b)

        //find min
        int min = num1,hcf=1,lcm;
        if(num2<num1){
            min = num2;
        }

       //hcf or gcd of num1 and num2
        for(int i=2;i<=min;i++){
            if(num1%i ==0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF - "+hcf);

        //calculate LCM
        lcm = (num1*num2)/hcf;
        System.out.println("LCM - "+lcm);
    }
}
