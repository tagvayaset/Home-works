package HW_week_4;
import java.util.ArrayList;

public class Exercise_13_2 {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        shuffle(list);
        System.out.print(list);
    }
    public static void shuffle(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            int randomIndex = (int)(Math.random()*list.size());
            Integer valueOfRandomIndex = list.get(randomIndex);

            list.set(randomIndex, list.get(i));
            list.set(i, valueOfRandomIndex);
        }

    }
}
