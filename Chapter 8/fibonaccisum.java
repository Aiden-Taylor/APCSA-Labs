import java.util.Scanner;
public class fibonaccisum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(sum(x, y, z, 0));
        scan.close();
    }
    public static int sum(int a, int b, int c, int sum){
        c--;
        sum += a;
        if (c == -1){
            return (sum + b);
        }
        else{
            return sum(b, a+b, c, sum);
        }
    }
}
