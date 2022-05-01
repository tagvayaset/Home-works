package HW_week_11;

import java.util.*;

public class Exercise_21_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int t;
        while ((t = scan.nextInt()) != 0) {
            list.add(t);
        }
        int visited = -1;
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);
        int[] v = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    v[j] = visited;
                }
            }
            if (v[i] != visited) {
                v[i] = count;
            }
        }
        int big = 0;

        for (int i = 0; i < v[i]; i++)
            if (v[i] >= big) big = v[i];

        for (int i = 0; i < arr.length; i++)
            if (v[i] != visited && v[i] == big) {
                System.out.println(arr[i]);
            }
    }
}
