package Program3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program3
{
  public static Long calculateAge(int month, int day, int year) throws ParseException
  {
    //parses the date provided in to a format
    String dateString = month + "/" + day + "/" + year;
    Date dateFormat = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
    //gets the current date
    Date currentDate = new Date();
    //subtracts the two dates and gets the result in days
    long diff = currentDate.getTime() - dateFormat.getTime();
    //gets the result in years
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365;
  }
  public static void main(String args[]) throws IOException, ParseException
  {
    //creates a file to read from
    File inputFile = new File("/Users/cjf/cis1115/Hw3/Program3/BirthDateList.txt");
    Scanner scanner = new Scanner(inputFile);
    //we pass the delimiter of non integer
    scanner.useDelimiter("\\D");
    //creates a file of results
    File outputFile = new File("/Users/cjf/cis1115/Hw3/Program3/AgeList.txt");
    FileWriter fileWriter = new FileWriter(outputFile);
    //writes the output to a file
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    //read while we have next items
    while (scanner.hasNext())
    {
      //read infomration of months day and year
      int month = scanner.nextInt();
      int day = scanner.nextInt();
      int year = scanner.nextInt();
      //read the next line
      scanner.nextLine();
      //write to output file after calculting age
      bufferedWriter.write("The age for DOB " + month +"/" + day +"/"+ year + " is " + String.valueOf(calculateAge(month, day, year)));
      bufferedWriter.newLine();
    }

    bufferedWriter.close();

  }
}
