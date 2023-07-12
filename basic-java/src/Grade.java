//Write a program that will ask the user to enter his/her marks
// (out of 100). Define a method that will display grades according
// to the marks entered as below:
// Marks        Grade
// 91-100         AA
// 81-90          AB
// 71-80          BB
// 61-70          BC
// 51-60          CD
// 41-50          DD
// <=40          Fail

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mark = input.nextInt();
        System.out.println(getGrade(mark));
    }

    public static String getGrade(int mark){

        String grade;

       if(mark > 90 && mark <= 100){
           grade = "AA";
       }else if(mark > 80 && mark <= 90){
           grade = "AB";
       }else if(mark > 70 && mark <= 80){
           grade = "BB";
       }else if(mark > 60 && mark <= 70){
           grade = "BC";
       }else if(mark > 50 && mark <= 60){
           grade = "CD";
       }else if(mark > 40 && mark <= 50){
           grade = "DD";
       }else{
           grade = "Fail";
       }
       return grade;
    }
}
