package homeworkweek7kajal;
//Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;

public class AlAlphabetOrSymbol12 {

    public static void main(String[] args) {
        identifyInput();
    }

    public static void identifyInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("Showing A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println("Showing A DIGIT.");

        } else {

            System.out.println(" Showing a SPECIAL CHARACTER.");
        }
    }
}
