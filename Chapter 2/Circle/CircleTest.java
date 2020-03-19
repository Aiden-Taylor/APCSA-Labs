import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = scan.nextDouble();
    Circle circle = new Circle(r);
    double area = circle.getArea();
    double circumference = circle.getCircumference();
    System.out.println("radius of circle1 = " + r + "\narea of circle1 = " + area + "\ncircumference of circle1 = " + circumference);
    System.out.println("Enter another radius: ");
    double r2 = scan.nextDouble();
    Circle circle2 = new Circle(r2);
    double area2 = circle2.getArea();
    double circumference2 = circle2.getCircumference();
    System.out.println("radius of circle2 = " + r2 + "\narea of circle2 = " + area2 + "\ncircumference of circle2 = " + circumference2);
  }
}