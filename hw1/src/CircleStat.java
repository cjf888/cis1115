import java.util.Scanner;
import java.text.DecimalFormat;


    public class CircleStat {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value for Radius: ");
            double r = sc.nextDouble();

            //formula circumference of circle = 2 * π * r
            double circumference = Math.PI * r * 2;

            //formula area of circle = π × r2
            double area = Math.PI * Math.pow(r, 2);

            double rounded1 = Math.round(circumference * 10000)/10000.0;
            double rounded2 = Math.round(area * 10000)/10000.0;

            System.out.println("When the radius is " + r + " the circumference is "
                    + rounded1 + " and the area is " + rounded2 + " .");

        }

    }
