package Day_1_Practice_Problems;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the dividend");
        int n = ip.nextInt();
        System.out.println("Enter the divisor");
        int d = ip.nextInt();
        System.out.println("The quotient is " + n/d);
        System.out.println("The remainder is " + n%d);
    }
}
