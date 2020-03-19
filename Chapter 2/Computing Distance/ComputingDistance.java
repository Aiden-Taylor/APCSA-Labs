import java.util.Scanner;
public class ComputingDistance
{
    public static void main (String[] args){
    Scanner scan = new Scanner(System.in); 

    System.out.println("X1");
    double x1 = scan.nextDouble();
    System.out.println("Y1");
    double y1 = scan.nextDouble();
    System.out.println("X2");
    double x2 = scan.nextDouble();
    System.out.println("Y2");
    double y2 = scan.nextDouble();
    
    double distance = Math.pow((Math.pow(y2-y1,2)+Math.pow(x2-x1,2)),0.5);
     
    System.out.print("Distance = " + distance);
}
}