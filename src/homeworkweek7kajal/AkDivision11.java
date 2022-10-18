package homeworkweek7kajal;

//. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
public class AkDivision11 {

    public static void main(String args[]) {
        numbers();
    }

    public static void numbers() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int x = 1; x < 100; x++) {
            if (x % 5 == 0) System.out.print(x + ", ");
        }
    }
}
