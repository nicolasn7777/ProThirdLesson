package file;

import java.io.*;

public class SimpleFile {
    public static void main(String[] args) throws IOException {
        File newFile = new File("D:\\programs\\IDE\\projects IDE\\ProThirdLesson\\src\\file\\newFile");

        FileWriter fw = new FileWriter(newFile, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Hi");
        pw.println("Java");
        pw.flush();
        pw.close();

        FileReader fr = new FileReader(newFile);
        BufferedReader br = new BufferedReader(fr);
        String temp = null;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();
    }
}
