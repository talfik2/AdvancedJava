package AdvanceJava.javadevelopmentDay04.javadevelopmentday04;


import java.io.File;
import java.io.IOException;

public class FolderCreation {
    public static void main(String[] args) throws IOException {
        //              FIRST FILE
        //File folder = new File("FirstFolderOutOfSrc");
        //folder.mkdir(); // mkdir = make direction
        //System.out.println("Folder is created inside the project, outside the src");
        //              FIRST FOLDER IN SRC
        //File folder1 = new File("src/FirstFolderInSrc");
        //folder1.mkdir(); // mkdir = make direction
        //System.out.println("Folder is created inside the src");
        //              FIRST SUBFOLDER IN SRC
        //File folder2 = new File("src/FirstFolderInSrc/FirstSubFolder");
        //folder2.mkdirs(); // mkdir = make direction
        //System.out.println("Sub Folder is created inside FirstFolderOutOfSrc");
        //              FIRST FILE INSIDE THE SUBFOLDER
        //File file1 = new File("src/FirstFolderInSrc/FirstSubFolder/File01.txt");
        //file1.createNewFile();
        //System.out.println("File inside the subfolder is created...");

        // Task: 1) Create a folder , name it as "TaskFolder"
        //       Create a sub-folder under "TaskFolder", name it as "TaskSubFolder"
        //       Create a txt file under "TaskFolder", name it as "FileOuter"
        //       Create a csv file under "TaskSubFolder", name it as "FileInner"
        // 1)
        //File folderOuter = new File("TaskFolder"); // Creating Folder
        //folderOuter.mkdir();
        //System.out.println("TaskFolder is created...");
        // Run the code and check Documents
        // 2)
        //File folderInner = new File("TaskFolder/TaskSubFolder");
        //folderInner.mkdirs();
        //System.out.println("TaskSubFolder is created...");
        // 3)
        //File fileOuter = new File("TaskFolder/FileOuter.txt");
        //fileOuter.createNewFile();
        //System.out.println("FileOuter txt file is created...");
        // 4)
        //File fileInner = new File("TaskFolder/TaskSubFolder/FileInner.csv");
        //fileInner.createNewFile();
        //System.out.println("FileInner csv file is created...");

    }
}
