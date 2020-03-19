
import java.util.Scanner;

public class Paint
{
  public static void main (String[] args){
     final int cpg = 350;
     Scanner scan = new Scanner (System.in);
     System.out.println("Length:");
     double length = Double.parseDouble(scan.nextLine());
     System.out.println("Width:");
     double width = Double.parseDouble(scan.nextLine());
     System.out.println("Height:");
     double height = Double.parseDouble(scan.nextLine());
     final double sqft = (length*width*height);
     double paint = (sqft/cpg);
     System.out.println("Length: " + length);
     System.out.println("Width: " + width);
     System.out.println("Height: " + height);
     System.out.println("Paint Needed: " + paint + " Gallons");
    }
}
