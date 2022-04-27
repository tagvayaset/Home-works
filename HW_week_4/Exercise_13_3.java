package HW_week_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_13_3 {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        list.add(10);
        list.add(2);
        list.add(10);
        list.add(65);
        list.add(75);
        list.add(1);
        list.add(5);
        list.add(3);

        sort(list);
        System.out.print(list);
    }
    public static void sort(ArrayList<Integer> list){

        int n = list.size();
        for(int i = 0; i < n-1; i++){
            for (int j = 1; j < n; j++){
                if(list.get(j) < list.get(j-1)){
                    int temp = list.get(j);
                    list.set((j), list.get(j-1));
                    list.set((j-1), temp);
                }
            }
        }
    }
}
