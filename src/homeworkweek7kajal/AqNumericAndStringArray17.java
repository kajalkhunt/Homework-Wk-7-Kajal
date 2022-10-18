package homeworkweek7kajal;
//Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class AqNumericAndStringArray17 {

    public static void main(String[] args) {
        numeric();
    }
    public static void numeric() {
        int[] array1 = {
                203, 57, 2, 105, 10, 99, 15, 239,};

        String[] array2 = {
                " Z ", " E ", " M ", " U ", " C ", " W "
        };
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));
        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));
    }
}

