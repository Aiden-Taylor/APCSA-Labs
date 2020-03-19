import java.util.Scanner;
import java.util.ArrayList;
public class Grades
{
    public static void main(String[] args)
    {
    Scanner scoop = new Scanner(System.in);
    int temp = 0;
    int temp1 = 0;
    int num = 1;
    String temo2 = "glsdb";
    //int grade = 0;
    String nt = "Obama";
    ArrayList<Student> StudentList = new ArrayList<Student>();
    while (temp1==0) {
    	System.out.println("Student's name: ");
    	nt = scoop.next();
    	Student s = new Student(nt);
    	num = 0;
    	temp = 0;
    	StudentList.add(s);
    		while (temp==0) {
    			System.out.println("Test Number " + (num+1));
    			s.inputGrades(num);
    			num ++;
    	    	System.out.println("More tests?");
    	    	temo2 = scoop.next();
    	    	if (temo2.toUpperCase().charAt(0) != 'Y') {
    	    		temp=1;}
    	    	}
    
    	System.out.println("More students?");
    	temo2 = scoop.next();
    	if (temo2.toUpperCase().charAt(0) != 'Y') {
    		temp1=1;
    	}
    }
    for (int i = 0; i < StudentList.size(); i++) {
    	System.out.println(StudentList.get(i).name + "'s Grades: ");
    	for (int n = 0; n < StudentList.get(i).grades.size(); n++) {
    		System.out.println("Test #" + (n+1) +"'s grade: " +StudentList.get(i).grades.get(n));
    	}
    }
	//input grades for Mary
	//print average for Mary

	System.out.println();

	//input grades for Mike
	//print average for Mike

    }
}