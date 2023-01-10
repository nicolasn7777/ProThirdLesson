package text_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\programs\\IDE\\projects IDE\\ProThirdLesson\\src\\text_file\\Text.txt");
        BufferedReader br = new BufferedReader(fr);
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
    }
}
