package hw8.src;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws Exception {
        calculation();

    }

    public static void calculation() {

        String operator;
        System.out.println("Please enter formula with operator sign contain only +,-,*,/ :");
        System.out.println("Note: (Please enter space between number amd operator)");
        Scanner sc = new Scanner(System.in);

        double numb1 = 0;
        while (true) {
            numb1 = Double.parseDouble(sc.next());
            if (numb1 != 0) {
                operator = sc.next();
                double numb2 = Double.parseDouble(sc.next());

                double result = 0;


                switch (operator) {
                    case "+":
                        result = (numb1 + numb2);
                        System.out.printf("%.2f", result);
                        break;

                    case "-":
                        result = (numb1 - numb2);
                        System.out.printf("%.2f", result);
                        break;

                    case "*":
                        result = (numb1 * numb2);
                        System.out.printf("%.2f", result);
                        break;

                    case "/":
                        result = (numb1 / numb2);
                        System.out.printf("%.2f", result);
                        break;

                    default:
                        System.out.println("Invalid operator entered! ");
                        calculation();
                }
                continue;
            }
            if (numb1 == 0) {
                System.out.println("Exit the program when 0 entered! ");
                break;
            }
        }
    }
}
