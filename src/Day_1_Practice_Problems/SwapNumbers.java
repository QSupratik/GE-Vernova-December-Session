package Day_1_Practice_Problems;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        int a, b, c;
        System.out.println("Enter the first number ");
        Scanner ip = new Scanner(System.in);
        a = ip.nextInt();
        System.out.println("Enter the second number ");
        b = ip.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The first number is " + a);
        System.out.println("The second number is " + b);
    }
}
