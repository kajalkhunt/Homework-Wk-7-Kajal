package homeworkweek7kajal;

import java.util.Scanner;

//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
public class AgSalesCommission7 {

    public static void main(String[] args) {
        commission();
    }

    public static void commission() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Sales ID :");
        String salesid = scan.nextLine();
        System.out.println("Enter Seller's Name :");
        String name = scan.nextLine();
        System.out.println("Enter Sales Amount :");
        int amount = scan.nextInt();
        System.out.println("Enter Basic Salary :");
        int Basicsalary = scan.nextInt();
        scan.close();
        if (amount >= 50000) {
            System.out.println("Commission :" + (amount * 35) / 100);
        }
        if (amount >= 30000 && amount < 50000) {
            System.out.println("Commission :" + (amount * 20) / 100);
        }
        if (amount >= 20000 && amount < 30000) {
            System.out.println("Commission :" + (amount * 10) / 100);
        }
        if (amount >= 10000 && amount < 20000) {
            System.out.println("Commission :" + (amount * 5) / 100);
        }
        if (amount < 10000) {
            System.out.println("Commission :" + (amount * 2) / 100);
        }
    }

}
