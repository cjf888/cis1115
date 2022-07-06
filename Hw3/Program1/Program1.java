package Program1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program1
{
  public static void calculateFactorial(int number, BufferedWriter file) throws IOException
  {
    //calculate factorial and output
    int factorial = 1;
    for (int i = 1; i <= number; i++)
    {
      factorial *= i;
    }

    file.write("The factorial of " + number + " is: " + String.valueOf(factorial));
    file.newLine();
  }

  public static void calculateSumOfSquares(int number, BufferedWriter file) throws IOException
  {
    //calculate sum
    int sum = 0;
    for (int i = 1; i <= number; i++)
    {
      //take square and sum
      sum += (i * i);
    }

    file.write("The sum of squares of for "+ number + " is " + String.valueOf(sum));
    file.newLine();

  }

  public static void calculateFibonacciSequence(int number, BufferedWriter file) throws IOException
  {
    int firstTerm = 0, secondTerm = 1;
    file.write("The fibonacci sequence for " + number + " is: ");

    //loop over till we have reached the number
    for (int i = 1; i <= number; ++i)
    {
      file.write(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }

    file.newLine();
  }

  public static void main(String[] args) throws IOException
  {
    //create files
    File inputFile = new File("/Users/cjf/cis1115/Hw3/Program1/numbersList.txt");
    File outputFile = new File("/Users/cjf/cis1115/Hw3/Program1/resultList.txt");
    FileWriter fileWriter = new FileWriter(outputFile);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    Scanner scanner = new Scanner(inputFile);
    //read till next item
    while (scanner.hasNext())
    {
      int number = scanner.nextInt();
      //call the methods
      calculateFactorial(number, bufferedWriter);
      calculateSumOfSquares(number, bufferedWriter);
      calculateFibonacciSequence(number, bufferedWriter);
    }

    bufferedWriter.close();

  }
}
