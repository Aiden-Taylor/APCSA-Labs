import java.util.Scanner;
public class Sales
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("How many Salespeople?");
final int SALESPEOPLE = scan.nextInt();
int[] sales = new int[SALESPEOPLE];
int sum;
double avg;
int max=0;
int min=100000;
String maxst = " ";
String minst = " ";
for (int i=0; i < sales.length; i++)
{
System.out.print("Enter sales for salesperson " + (i+1) + ": ");
sales[i] = scan.nextInt();
}
System.out.println("\nSalesperson Sales");
System.out.println("--------------------");
sum = 0;
for (int i=0; i < sales.length; i++)
{
System.out.println("\t " + (1+i) + "\t\t\t" + sales[i]);
sum += sales[i];
if (sales[i]>max) {
	max = sales[i];
	maxst = ("Salesperson " + (i+1) + " had the most sales, a total of " + max);
}
if (sales[i] < min) {
	min = sales[i];
	minst = ("Salesperson " + (i+1) + " had the least sales, a total of " + min);
}
}
avg = ((double)sum)/sales.length;
System.out.println("\nTotal sales: " + sum);
System.out.println("Average sales: " + avg);
System.out.println(maxst);
System.out.println(minst);
}
}