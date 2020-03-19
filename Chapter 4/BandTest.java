import java.util.Scanner;
public class BandTest{
    public static void main(String[] args){
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the band booster:");
        BandBooster bandbooster1 = new BandBooster(scan.next());
        System.out.println("Please enter the name of the band booster:");
        BandBooster bandbooster2 = new BandBooster(scan.next());
        for (int i=1; i<4; i++){
            System.out.println("Enter the number of boxes sold by " + bandbooster1.getName() + "for week " + i);
            temp = scan.nextInt();
            bandbooster1.updateSales(temp);
        }
        for (int i=1; i<4; i++){
            System.out.println("Enter the number of boxes sold by " + bandbooster2.getName() + "for week " + i);
            temp = scan.nextInt();
            bandbooster2.updateSales(temp);
        }
        System.out.println("\n" + bandbooster1.toString());
        System.out.println("\n" + bandbooster2.toString());
    }
}