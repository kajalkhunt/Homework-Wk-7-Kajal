package homeworkweek7kajal;

import java.util.Scanner;

//Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)
public class AjSymbol10 {
    public static void main(String[] args) {
        Calculator();
    }

    public static void Calculator() {
        int a;
        int b;
        char z;

        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter first value");
        a = scan.nextInt();
        System.out.println("Enter second value");
        b = scan.nextInt();
        System.out.println("Enter symbol");
        z = scan.next().charAt(0);
        scan.close();
        System.out.println();

        if (z == '+') {
            System.out.println("Addition of" + a + " + " + b + " = " + (a + b));
        } else if (z == '-') {
            System.out.println("Subtraction of" + a + " - " + b + " = " + (a - b));
        } else if (z == '/') {
            System.out.println("Division of" + a + " / " + b + " = " + (a / b));
        } else if (z == '*') {
            System.out.println("Multiplication of" + a + " * " + b + " = " + (a * b));
        } else
            System.out.println("Invalid Entry");
    }

}

