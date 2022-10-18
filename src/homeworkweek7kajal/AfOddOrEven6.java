package homeworkweek7kajal;
//Write a java program to input any number and find out if it’s odd or even.
import java.util.Scanner;

public class AfOddOrEven6 {

    public static void main(String[] args) {
        oddeven();
    }
    public static void oddeven() {
        int n;
        System.out.print("Input any number: ");
        Scanner scan = new Scanner(System.in);
         n = scan.nextInt();
         scan.close();
        if (n % 2 == 0){
            System.out.println(" Number " + n + " is even number");
        } else{
                System.out.println(" Number " + n + " is odd number");
            }
        }
    }

