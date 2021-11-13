package javadevelopmentDay05;


import java.io.*;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        // 1'st Way to Read File
        //try(BufferedReader br = new BufferedReader(new FileReader("Folder1/FileToWrite.txt"))){
        //    String line;
        //    while((line = br.readLine())!= null){
        //        System.out.println(line);
        //    }
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
// If you read huge file 8 KB, use this way
// You can use Multithreading
// You can also use it with Fully or partial Synchronization
// Can be used for larger data till 8 KB

        // 2'nd Way to Read File
        //try(Scanner scan = new Scanner(new File("Folder1/FileToWrite.txt"))){
        //    String line;
        //    while(scan.hasNext()) {
        //        line = scan.nextLine();
        //        System.out.println(line);
        //    }
/*
If we need MultiThreading, do not use this way.
You cannot use Synchronized & Synchronized(This)
Slower than 1'st way
Can be used for small data till 1 KB. Thus, it is being used if you get data from customer.
 */
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}

        //3'rd Way to Read File
        //try(FileInputStream fis = new FileInputStream("Folder1/FileToWrite.txt")) {
        //    int k;
        //    while ((k = fis.read()) !=-1) {
        //        System.out.print((char)k);
        //    }
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
    }

}
