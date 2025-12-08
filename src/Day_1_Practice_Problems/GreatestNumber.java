package Day_1_Practice_Problems;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a,b,c;
        a=ip.nextInt();
        b=ip.nextInt();
        c=ip.nextInt();
        System.out.println("The largest of the 3 numbers is ");
        System.out.println( (a>b) ? ((a>c)?a:c) : ((b>c)?b:c) );
    }
}
