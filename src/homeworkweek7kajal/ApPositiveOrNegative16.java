package homeworkweek7kajal;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or ZERO

public class ApPositiveOrNegative16 {

    public static void main(String[] args) {
        zero();
    }
    public static void zero() {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();
//checks the number is greater than 0 or not
        if (num > 0) {
            System.out.println("The number is positive.");
        }
//checks the number is less than 0 or not
        else if (num < 0) {
            System.out.println("The number is negative.");
        }
//executes when the above two conditions return false
        else {
            System.out.println("The number is zero.");
        }
    }
}

