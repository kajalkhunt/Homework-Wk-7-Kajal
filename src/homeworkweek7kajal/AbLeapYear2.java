package homeworkweek7kajal;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class AbLeapYear2 {

    public static void main(String[] args) {
        AbLeapYear2 obj = new AbLeapYear2();
        obj.leapyear();
    }

    public void leapyear() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year  number :");
        int number = scan.nextInt();
        scan.close();

        if (number % 4 == 0) {
            System.out.println(" This is a Leap year");
        } else {
            System.out.println(" This is not Leap year");
        }

    }
}
