package homeworkweek7kajal;

import java.util.Scanner;

//Write a Java program to test if an array contains a specific value.
public class AtArray20 {

    public static void main(String[] args) {
        value();
    }
    public static void value() {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the specific value : ");
        x = scanner.nextInt();
        scanner.close();
        int[] num = {50, 60, 70, 80, 90};
        int toFind = x;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}


