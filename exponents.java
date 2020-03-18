import java.util.Scanner;
public class exponents{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number?");
        int num = scan.nextInt();
        System.out.println("Exponent?");
        int exp = scan.nextInt();
        System.out.println(imgonnamakethismethodnamesuperlongsonobodycancopiouslystealmylabs(num, exp, num));
        scan.close();
    }
    public static int imgonnamakethismethodnamesuperlongsonobodycancopiouslystealmylabs(int a, int b, int c){
        b--;
        if (b == 0){
            return(a);
        }
        else{
            return imgonnamakethismethodnamesuperlongsonobodycancopiouslystealmylabs(a*c, b, c);
        }
    }
}