package HW_week_8;

import java.io.*;

public class Exercise_17_2 {

    public static void main(String[] args) throws IOException {

        if(new File("src\\HW_week_9\\Exercise17_02.dat").exists() == false) {

            File file = new File("src\\HW_week_9\\Exercise17_02.dat");

            PrintWriter printWriter = new PrintWriter(file);

            for (int i = 0; i < 100; i++)
                printWriter.write(((int) (Math.random() * 10)) + " ");

            printWriter.close();
        }else {
            FileWriter fileWriter = new FileWriter(new File("src\\HW_week_8\\Exercise17_02.dat"));

            for (int i = 0; i < 100; i++)
                fileWriter.write(((int) (Math.random() * 10)) + " ");

            fileWriter.close();

        }


    }
}
