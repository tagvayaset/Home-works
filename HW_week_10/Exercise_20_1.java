package HW_week_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Exercise_20_1 {

    public static void main(String[] args) throws FileNotFoundException {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        File file = new File("C:\\Users\\tagva\\IdeaProjects\\Practice\\src\\HW_week_10\\words.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String s = scanner.next();
            priorityQueue.add(s);
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll() );
        }

    }
}
