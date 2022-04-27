package HW_week_3;

import java.util.Scanner;

public class Exercise_12_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        while (true) {
            try {
                int i = scan.nextInt();

                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds");
            }
        }
    }
}
