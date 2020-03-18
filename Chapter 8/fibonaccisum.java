import java.util.Scanner;
public class fibonaccisum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(hahajoshissostupidandweirdidontevenunderstandhowhisparentsevenlovehim(x, y, z, 0));
        scan.close();
    }
    public static int hahajoshissostupidandweirdidontevenunderstandhowhisparentsevenlovehim(int a, int b, int c, int sum){
        c--;
        sum += a;
        if (c == -1){
            return (sum + b);
        }
        else{
            return hahajoshissostupidandweirdidontevenunderstandhowhisparentsevenlovehim(b, a+b, c, sum);
        }
    }
}