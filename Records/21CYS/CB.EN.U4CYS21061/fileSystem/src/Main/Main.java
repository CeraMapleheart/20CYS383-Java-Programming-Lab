package Main;

com.amrita.jpl.21cys21061.endsem;

import javax.swing.*;
import java.util.*;
import java.util.ArrayList;
import static java.nio.file.Files.size;
import java.util.Scanner;
/*
 * @author Roshni
 * file management system - documents/images/videos
 * */


class File {
    /* filename - string, filesize - long
     * */
    private String fileName;
    private long fileSize;
    public File(String fileName, long fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
    public String getFileName() {
        return fileName;
    }
    public long getFileSize() {
        return fileSize;
    }
}

class Document {
    private String documentType;
    public Document(String fileName, long fileSize, String documentType) {
        this.documentType = documentType;
    }
    public String getDocumentType() {
        return documentType;
    }
}

class Image {
    private String resolution;
    public Image(String fileName, long fileSize, String resolution) {
        this.resolution = resolution;
    }
    public String getResolution() {
        return resolution;
    }
}

class Video {
    private String duration;
    public Video(String fileName, long fileSize, String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }
}
interface FileManager {
    void addFile(File file);
    void deleteFile(String fileName);
    void getFiles(String fileName);
    ArrayList<File> getFiles();
}

class FileManagerImpl implements FileManager {
    private ArrayList<File> files;
    public FileManagerImpl() {
        this.files = new ArrayList<>();
    }
    public void addFile(File file) {
        files.add(file);
    }
    public void deleteFile(String fileName) {
        files.remove(fileName);
    }
    public void getFile(String fileName){
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
    public static void Main() {
        public void FileManagementSystemUI();
    }
}














