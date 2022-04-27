package HW_week_3;

import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class Exercise_12_11 {
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\tagva\\IdeaProjects\\Practice\\src\\HW_week_3\\text.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner in = new Scanner(file);

        String result = "";
        while (in.hasNext()){
            String s = in.next();
            System.out.print(s + " ");
            result = result + s + " ";
        }
        in.close();
        fileReader.close();

        Scanner scan = new Scanner(System.in);

        System.out.print("\nWrite a word to remove: ");
        String remove = scan.next();
        System.out.println("\nAfter removing");

        result = result.replaceAll(remove, "");
        PrintWriter writer = new PrintWriter(new File(path));
        writer.append(result);
        writer.flush();

        in = new Scanner(file);
        fileReader = new FileReader(file);

        while (in.hasNext()){
            String s = in.next();
            System.out.print(s + " ");
            result = result + s + " ";
        }
        in.close();
        fileReader.close();

    }

}