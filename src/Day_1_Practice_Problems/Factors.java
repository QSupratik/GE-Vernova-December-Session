package Day_1_Practice_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        System.out.println("Enter the number N");
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ArrayList<Integer> answers = new ArrayList<Integer>();
        int k=n;

        for(int i=2;i*i<=k;i++){
            if(n%i==0){
                answers.add(i);
                while(n%i==0){
                    n/=i;
                }
            }
        }

        for(int i=0;i<answers.size();i++){
            System.out.println(answers.get(i));
        }
    }
}
