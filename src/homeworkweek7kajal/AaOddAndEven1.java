package homeworkweek7kajal;

import java.util.Scanner;

//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
public class AaOddAndEven1 {
    static int a;

    public static void main(String[] args) {
        odd();
    }
    public static void odd() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to test :");
        a = scan.nextInt();
        scan.close();

        String result = a % 2 == 0 ? " Even" : " Odd";
        System.out.println(a + " is " + result);
    }
}


