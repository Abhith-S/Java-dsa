import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class NumOperator {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char operator = input.next().charAt(0);
        float operationResult;

        if(operator == '+'){
            operationResult = num1 + num2;
        }else if(operator == '-'){
            operationResult = num1 - num2;
        }else if(operator == '*'){
            operationResult = num1 * num2;
        }else{
            operationResult = num1 / num2;
        }

        System.out.println(operationResult);
    }
}
