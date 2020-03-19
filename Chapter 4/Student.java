import java.util.Scanner;
import java.util.ArrayList;
public class Student
{
	String name;
	//int grade;
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> grades;
    public Student(String studentName)
    {
    	name = studentName;
    	grades = new ArrayList<Integer>();
    }
    public int inputGrades(int tnum)
    {
	System.out.println("Enter " + name + "'s score for test #" + (tnum+1));
	int grade = scan.nextInt();
	grades.add(grade);
	return grade;
    }
}