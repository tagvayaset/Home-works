package HW_week_9;

import java.util.ArrayList;

public class Exercise_19_4 {

    public static void main(String[] args) {

        Integer[] array = {1, 5, 7, 8, 9};

        ArrayList arrayList = new ArrayList();
        arrayList.add(50);
        arrayList.add(5);
        arrayList.add(188);
        arrayList.add(55);
        arrayList.add(198);
        arrayList.add(287);

        System.out.println(linearSearch(array, 5));
        System.out.println(max(arrayList));

    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){

        int r = -1;

        for(int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                r = i;
            }
            return r;
        }

        return r;

    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list){

        E r = list.get(0);

        for(int i = 0; i < list.size()-1; i++) {
            if (list.get(i).compareTo(list.get(i+1)) == -1) r = list.get(i+1);
        }

        return r;
    }
}
