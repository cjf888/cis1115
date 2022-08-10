package hw8.src;

import java.io.*;
import java.util.Scanner;

public class Wordcount {
    public static String masterFile;


    public static void main(String[] args) throws Exception
    {
        readFile();
    }

    public static void readFile() throws Exception
    {
        System.out.println("Enter Master File Name:");
        Scanner readFileName = new Scanner(System.in);
        masterFile = readFileName.next();
        if (new File(masterFile).exists())
            countFile();
        else
        {
            System.out.println("File do not exit! ");
            readFile();
        }
    }

    public static void countFile() throws Exception
    {
        String line;
        int count = 0;
        FileReader file = new FileReader(masterFile);
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null) {
            String word[] = line.split(" ");
            count = count + word.length;
        }
        System.out.println("Number of words present in file: " + count );
    }
}