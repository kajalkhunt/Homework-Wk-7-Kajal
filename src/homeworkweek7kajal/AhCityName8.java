package homeworkweek7kajal;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class AhCityName8 {

    public static void main(String[] args) {
        Alphabets();
    }
    public static void Alphabets() {
        char x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A to F : ");
        x = scanner.next().charAt(0);
        scanner.close();

        if (x == 'A') {
            System.out.print("Amersham");
        } else if (x == 'B') {
            System.out.print("Barcelona");
        } else if (x == 'C') {
            System.out.print("Chesham");
        } else if (x == 'D') {
            System.out.print("Doncaster");
        } else if (x == 'E') {
            System.out.print("Enfield");
        } else if (x == 'F') {
            System.out.print("Feltham");
        } else {
            System.out.print("Invalid Entry");
        }


    }
}
