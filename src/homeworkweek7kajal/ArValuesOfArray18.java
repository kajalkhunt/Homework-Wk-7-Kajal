package homeworkweek7kajal;
//Write a Java program to sum values of an array.

public class ArValuesOfArray18 {
    // Driver method
    public static void main(String[] args) {
        length();
    }
    public static void length() {
        double  sum = 0.0;
        double array[] = {20.4, 13, 45.2, 10};
        int i = 0;
        for (i = 0; i < array.length; i++)
            sum += array[i];
        System.out.println("Sum of given array is " + sum);
    }
}
