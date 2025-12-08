package Day_2_Practice_Problems;
import java.util.Scanner;

public class Line_Comparison {
    public static void main(String[] args){
        System.out.println("Welcome to the Line Comparison Program\n");

        //Length Calculation
        Line l1 = new Line(getPoint(), getPoint());
        double lenL1 = l1.calculateLength();
        System.out.println("The Length is " + lenL1);
        Line l2 = new Line(getPoint(), getPoint());
        double lenL2 = l2.calculateLength();
        System.out.println("The Length is " + lenL2);
        l2.calculateLength();

        //
    }

    public static Point getPoint(){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter x-coordinate");
        double x=ip.nextDouble();
        System.out.println("Enter y-coordinate");
        double y=ip.nextDouble();
        return new Point(x,y);
    }
}
