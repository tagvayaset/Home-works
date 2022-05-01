package HW_week_11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise_21_1 {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>();

        linkedHashSet1.add("George");
        linkedHashSet1.add("Jim");
        linkedHashSet1.add("John");
        linkedHashSet1.add("Blake");
        linkedHashSet1.add("Kevin");
        linkedHashSet1.add("Michael");

        linkedHashSet2.add("George");
        linkedHashSet2.add("Katie");
        linkedHashSet2.add("Kevin");
        linkedHashSet2.add("Michelle");
        linkedHashSet2.add("Ryan");


        Set intersects = new LinkedHashSet();

        intersects.addAll(linkedHashSet1);
        intersects.retainAll(linkedHashSet2);

        System.out.println("intersect: " + intersects);

        LinkedHashSet union = linkedHashSet1;
        union.addAll(linkedHashSet2);
        System.out.println("union: " + union);

        LinkedHashSet difference1 = linkedHashSet1;
        difference1.removeAll(linkedHashSet2);
        System.out.println("linkedHashSet2 / linkedHashSet1: " + difference1);

        LinkedHashSet difference2 = linkedHashSet2;
        difference2.removeAll(linkedHashSet1);
        System.out.println("linkedHashSet1 / linkedHashSet2: " + difference2);






    }
}
