package FilePractice;

import java.io.FileInputStream;
import java.io.IOException;

public class FISPlay {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\New folder\\fis.txt");

        System.out.println(fis.getChannel());

        System.out.println(fis.getFD());

        System.out.println("Number of remaining bytes: " + fis.available());
    }
}
