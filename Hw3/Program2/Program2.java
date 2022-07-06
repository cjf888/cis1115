package Program2;

import java.util.Scanner;

public class Program2
{
  public static void main(String[] args)
  {
    String shapeName;
    double radius, length, width;
    Scanner sc=new Scanner(System.in);
    //Take input from the user about shape
    System.out.print("Enter the shape name : ");
    shapeName = sc.nextLine();
    //check if the shape enterd is circle
    if(shapeName.equalsIgnoreCase("Circle"))
    {
      //show the selection
      System.out.println("You have selected circle, Please enter the details!");
      //take input of the radius
      System.out.print("Please enter the radius of the circle : ");
      radius = sc.nextDouble();
      //the formula of radius
      double circumference = 2 * (3.14 * radius);
      //print the circumference
      System.out.println("The circumference of the circle is : "+circumference);
      double area = 3.14 * (radius * radius);
      //print the area of the circle
      System.out.println("The area of the circle is : "+area);


    }
    else if(shapeName.equalsIgnoreCase("Rectangle"))
    {
      //show the selection
      System.out.print("You have selected Rectangle, Please enter the details!");
      //take the input of the length
      System.out.print("Please enter the length of the rectangle : ");
      length = sc.nextDouble();
      //take the input of the width
      System.out.print("Please enter the width of the rectangle : ");
      width=sc.nextDouble();
      //calculate the perimeter of the rectangle
      double perimeter = 2 * (length + width);
      //calculate the area of the rectangle
      double area = length * width;
      //print the area and the perimeter
      System.out.println("The area of the rectangle is : "+area);
      System.out.println("The perimeter of the rectangle is : "+perimeter);
    }
    else
    {
      //
      System.out.println("Invalid Shape, please enter either Circle or Rectangle");
    }

  }
}
