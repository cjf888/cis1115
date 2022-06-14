import java.util.Scanner;

public class RectangleStat {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter value for width: ");
      double width = sc.nextInt();

      System.out.print("Enter value for length: ");
      double length = sc.nextInt();

      //formula area of rectangle = width * length
      double area = (width * length);

      //formula perimeter of rectangle = ( width * 2 ) + ( length * 2 )
      double perimeter = ( width * 2 ) + ( length * 2 );


      System.out.println("When one width is " + width + " and the length is " +
      length + ", the area is " + area + " and the perimeter is "
       + perimeter + ".");







  }
}
