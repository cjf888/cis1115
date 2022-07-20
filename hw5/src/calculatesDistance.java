package hw5.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;



public class calculatesDistance {

    public static int distance(int speed,int hour) {
        return speed * hour;
    }

    public static void saveAsFile(String fileName,int speed, int time ) throws FileNotFoundException {

        int distanceTraveled;

        if (speed < 0 || time < 1){
            return;
        }

        fileName = fileName + ".txt";
        PrintStream ps = new PrintStream(fileName);
        ps.println(fileName);
        ps.printf("%4s%22s\n", "Hour","Distance Traveled");
        ps.println("--------------------------");

        for (int hour = 1; hour <=  time; hour++){
           distanceTraveled = distance(speed,hour);
           ps.printf("%4s%22s\n",hour,distanceTraveled);
        }
        ps.close();

    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("sample.txt"));
        //PrintStream ps = new PrintStream();


        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            String fileName = data[0];
            int speed = Integer.parseInt(data[1]);
            int time = Integer.parseInt(data[2]);

            saveAsFile(fileName, speed, time);

        }
        scanner.close();
    }

}





