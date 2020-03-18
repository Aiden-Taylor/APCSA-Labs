import java.util.Scanner;
public class decimaltooctal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(aidenissosmartandcoolhecanprograminjavalikeagodbutnotaswellasjackson(x, 0, 1+(int)(Math.log(x)/Math.log(8))));
        scan.close();
    }
    public static int aidenissosmartandcoolhecanprograminjavalikeagodbutnotaswellasjackson(int a, int b, int c){
        c--;
        if (a == 0){
            return b;
        }
        else{
            b += Math.pow(10, c)*a/(Math.pow(8, c));
            a = a%(int)(Math.pow(8, c));
            return aidenissosmartandcoolhecanprograminjavalikeagodbutnotaswellasjackson(a, b, c);
        }
    }
}