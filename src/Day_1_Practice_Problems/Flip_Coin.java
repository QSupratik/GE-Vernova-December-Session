package Day_1_Practice_Problems;
import java.util.Scanner;

public class Flip_Coin {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.printf("Enter the number of flips\n");
        int flips=ip.nextInt();
        if(flips<0){
            System.out.printf("It is not a positive integer\n");
            return;
        }
        int tails=0, heads=0;

        for(int j=0;j<flips;j++){
            double k=Math.random();
            if(k<0.5){
                tails++;
            }
            else{
                heads++;
            }
        }
        System.out.println("Percentage of tails is " + (double)heads/flips*100);
        System.out.println("Percentage of heads is " + (double)tails/flips*100);
    }
}
