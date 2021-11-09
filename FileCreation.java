package AdvanceJava.javadevelopmentDay04.javadevelopmentday04;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        //File file = new File("FirstFile.txt");
        //file.createNewFile();
        //System.out.println("File Created...");

        //File file2 = new File("FirstFileOutOfSrc.txt");
        //file2.createNewFile();
        //System.out.println("File Created...");

        File file3 = new File("src/FirstFileInSrc.txt");
        file3.createNewFile();
        System.out.println("File Created...");

        /* Task
        Create a file under the documents folder in your local computer,
        and name it as your own name.
        File file4 = new File("/Users/apple/Documents/Tevfik.txt");
        file4.createNewFile();
        System.out.println("File Created...");
         */
    }
}
