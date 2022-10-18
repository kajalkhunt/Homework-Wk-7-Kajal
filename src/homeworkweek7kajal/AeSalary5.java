package homeworkweek7kajal;

import java.util.Scanner;

//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
//salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF
//Print in following format
public class AeSalary5 {

    public static void main(String[] args) {
    Grosssalary();
    }
    public static void Grosssalary() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empid = scan.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Basic salary: ");
        double salary = scan.nextDouble();
        scan.close();

        System.out.println("|---------------------------------|");
        System.out.println("|           Salary slip           |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        System.out.println("| Employee ID :  " + empid + "             |");
        System.out.println("| Employee Name :  " + name + "            |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
         System.out.println("| Basic Salary :  " + salary + "         |");
        double HRA = (salary * 10) / 100;
        System.out.println("| HRA :  " + HRA + "                   |");
        double DA = (salary * 8) / 100;
        System.out.println("| DA :   " + DA + "                   |");
        double TA = (salary * 9) / 100;
        System.out.println("| TA :   " + TA + "                   |");
        double PF = (salary * 20) / 100;
        System.out.println("| PF :    " + PF + "                  |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        double Grosssalary = salary + HRA + DA + TA - PF;
        System.out.println("|Gross Salary : " + Grosssalary + "           |");
        System.out.println("|=================================|");
    }
}


