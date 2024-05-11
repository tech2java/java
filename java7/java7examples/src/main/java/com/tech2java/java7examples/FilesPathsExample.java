package com.tech2java.java7examples;


import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.logging.Logger;

/**
 * Paths.get
 * Files.readAllBytes
 * Files.realAllLines
 * Files.write
 * Files.createDirectory
 * Files.createFile
 * Files.newInputStream
 * Files.copy
 * Files.delete
 * Files.deleteIfExists
 *
 */
public class FilesPathsExample {

    private static final Logger LOGGER=Logger.getLogger(FilesPathsExample.class.toString());

    private static final String HOME_DIR="E://";

    public static void main(String[] args) throws IOException {

        Path path=Paths.get(HOME_DIR,"FilesExamples","one.txt");

        //Reading file content in bytes
        byte[] bytes=Files.readAllBytes(path);

        String fileContent=new String(bytes, StandardCharsets.UTF_8);
        System.out.println(fileContent);

        //Reading all lines from a file
        List<String> fileLines=Files.readAllLines(path);

        for(String line:fileLines){
            System.out.println(line);
        }
        //java 8
        fileLines.forEach(System.out::println);

        //Adding a line to the file
        String newLine="\nSpring boot.. Microservices";
        Files.write(path,newLine.getBytes(), StandardOpenOption.APPEND);

        //Create a Directory(newDir)
        Path dirPath=Paths.get(HOME_DIR,"newDir");

        Files.createDirectory(dirPath);
        System.out.println("Directory is created..");

        //Create a file inside the directory
        Path filePath = Paths.get(HOME_DIR, "newDir", "two.txt");
        Files.createFile(filePath);
        System.out.println("File is created..");

        //Copy content from one file to another file.
        InputStream inputStream =Files.newInputStream(path);
        Path newFilePath=Paths.get(HOME_DIR,"newDir","newFile.txt");//file should be new
        Files.copy(inputStream,newFilePath);
        System.out.println("File content copied to newFile.txt");

        //Copy content to existing file.
        Files.copy(path,filePath, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);

        //Deleting a file
        Files.delete(newFilePath);
        LOGGER.info("file got deleted.."+newFilePath);

        boolean deleted=Files.deleteIfExists(newFilePath);
        LOGGER.info("deleted::"+deleted);

    }
}
