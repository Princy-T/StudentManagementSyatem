package studentManagementSystem;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		// enter number of student want to add form user 
		System.out.print("Enter number of new Students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// creating n number of new students
		for(int n = 0; n < numOfStudents; n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n = 0; n < numOfStudents; n++)
		{
			System.out.println(students[n].toString());
		}
	}

}
