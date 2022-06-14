import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int homework;
        int codeLab;
        int midterm1;
        int midterm2;
        int finalExam;
        double totalScore;
        System.out.println("Enter a value for homework and press RETURN.");
        homework = sc.nextInt();

        System.out.println("Enter a value for codelab and press RETURN.");
        codeLab = sc.nextInt();

        System.out.println("Enter a value for midterm1 and press RETURN.");
        midterm1 = sc.nextInt();

        System.out.println("Enter a value for midterm2 and press RETURN.");
        midterm2 = sc.nextInt();

        System.out.println("Enter a value for finalExam and press RETURN.");
        finalExam = sc.nextInt();

        //formula totalScore=(15% * homework) + (10% * codeLab) + (20% * midterm1)
        // + (20% * midterm2) + (35% * finalExam)
        totalScore = (homework * 0.15) + (codeLab * 0.10) + (midterm1 * 0.20) +
                (midterm2 * 0.20) + (finalExam * 0.35);

        System.out.println("The total score is " + totalScore);








    }
  }
