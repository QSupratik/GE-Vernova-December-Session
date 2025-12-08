package Day_1_Practice_Problems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ip.nextInt();
        if( (a&1)==1 ){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
