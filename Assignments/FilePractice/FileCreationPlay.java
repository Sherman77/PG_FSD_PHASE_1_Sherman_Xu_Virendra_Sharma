package FilePractice;

import java.io.FileWriter;
import java.util.Scanner;

public class FileCreationPlay {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            FileWriter output = new FileWriter("C:\\New folder\\new.txt");
            output.write(input);
            System.out.println("Data is written to the file");

            output.close();
        } catch (Exception e) {
            System.out.println("An exception thrown");
            e.getStackTrace();
        }
    }
}
