package Day_1_Practice_Problems;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args){
        System.out.println("Enter the term number N");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum += (double) 1/i;
        }
        System.out.println("The sum is " + sum);
    }
}
