package homeworkweek7kajal;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry using switch statement.
public class AiCityNameWithSwitch9 {

    public static void main(String[] args) {
        cityNames();
    }

    public static void cityNames() {
        String grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A to F");
        grade = scanner.next();
        scanner.close();

        switch (grade) {

            case "A":
                System.out.println("Amersham");
                break;
            case "B":
                System.out.println("Barcelona");
                break;
            case "C":
                System.out.println("Chesham");
                break;
            case "D":
                System.out.println("Doncaster");
                break;
            case "E":
                System.out.println("Enfield");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid output");
        }
    }
}
