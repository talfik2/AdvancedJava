package javadevelopmentDay05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {
    public static void main(String[] args) throws IOException {
        File folder = new File("Folder1");
        //folder.mkdir();

        File file1 = new File("Folder1/FileToWrite.txt");
        //try {
        //    file1.createNewFile();
        //} catch (IOException e) {
        //    System.err.println("An Error occurred while creating the file...");
        //}

        // 1'st Way to Create File
        try {
            FileWriter fw = new FileWriter(file1, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Kalbim duraksiz haykirislarda");
            bw.newLine();
            bw.write("Ne yapsam ayrilamam senden asla");
            bw.newLine();
            bw.write("Hafife alma ask vurur insana");
            bw.newLine();
            bw.write("Bu kadar kolay sanma");
            bw.newLine();
            bw.write("Delikanlım...");
            bw.newLine();
            bw.close();
            System.out.println("We just wrote sth inside the FileToWrite!!");
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file...");

        }
        /*
        Advantages of bw.close()
        1) If you use bw.close(), you remove the unused object, hence you save memory. You can think like my memory is huge,
    not to closing my statement couldn't create any problem. However, since you are going to work maybe 1000 classes,
    after some time, you would get OutOfMemory Error. As you know, OutOfMemory Error cannot be handled. Definitely, it brakes
    your application.
        2) Data Leak .Since you use bw.close(), you removed unused object from your memory, you make your application more secure.
    Because if you don't remove your unused previous object, someone write something in it. Let's just say you have banking project
    unused object is about your ID, or SSN. If somebody reaches it, s/he can use it on his/her behalf.
        3) If you keep many unused objects in your memory, your application runs slower. It decreases the performance of your application.
    As a result, you are less likely to see the advantages of MultiThreading since it is known to improve processing power in lesser time.
         */
        // 2nd Way of Writing Files
        // Recommended Usage, in this way, Java closes write statements for you...
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file1, true))) {
            bw.write("Remember those walls I built");
            bw.newLine();
            bw.write("Well, baby, they're tumbling down");
            bw.newLine();
            bw.write("And they didn't put up a fight");
            bw.newLine();
            bw.write("They didn't even make a sound");
            System.out.println("Our 2nd Way works...");
        }catch(IOException e) {
            System.err.println("An Error occurred while creating the file...");
        }
    }

}
