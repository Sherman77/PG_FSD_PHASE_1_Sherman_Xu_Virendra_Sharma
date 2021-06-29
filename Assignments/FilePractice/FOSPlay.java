package FilePractice;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSPlay {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fos = new FileOutputStream("C:\\New folder\\fos.txt", true);

        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
        System.out.println("Please enter your text (Enter\"#\" at the end)");

        char ch;

        while ((ch = (char) dis.read()) != '#') {
            bos.write(ch);
        }
        bos.close();
    }
}
