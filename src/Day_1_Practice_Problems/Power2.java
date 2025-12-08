package Day_1_Practice_Problems;

import java.util.Scanner;

public class Power2 {
    public static void main(String[] args){
        System.out.println("Enter the value of N");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        if(n>31){
            System.out.println("Enter a value lesser than 31 ");
        }
        else{
            int k=1;
            for(int i=0;i<=n;i++){
                System.out.println(k);
                k=k<<1;
            }
        }
    }
}
