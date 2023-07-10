import java.util.Scanner;

//area of circle , triangle, rectangle, isosceles triangle, parallelogram, rhombus, equilateral triamgle
public class Area {
    public static void main(String[] args) {

        //get input
        Scanner input  = new Scanner(System.in);

        //circle
        //pi * r2
//        float radius  = input.nextFloat();
//        double area = Math.PI * Math.pow(radius,2);

        //triangle
//        float breadth = input.nextFloat();
//        float height = input.nextFloat();
//        double area = 0.5 * breadth * height;

        //reactangle
        float length = input.nextFloat();
        float breadth = input.nextFloat();
        double area = length*breadth;



        System.out.println(area);
    }
}
