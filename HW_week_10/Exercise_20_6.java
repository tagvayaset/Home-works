package HW_week_10;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise_20_6 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 500000; i++){
            linkedList.add(((int)(Math.random()*5)));
        }

        Iterator iterator = linkedList.iterator();

        long startTime = System.nanoTime();
        while (iterator.hasNext()){
            int t = (int)iterator.next();
        }

        System.out.println("time by iteration: " +((double)(System.nanoTime() - startTime) / 1_000_000_000) + " seconds");

        long startTime2 = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++){
            int t = linkedList.get(i);
        }

        System.out.println("time by get(index): " +((double)(System.nanoTime() - startTime) / 1_000_000_000) + " seconds");



    }
}
