package Day_1_Practice_Problems;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = ip.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("It is a vowel\n");
        }
        else{
            System.out.println("It is a consonant");
        }
    }
}
