package studentManagementSystem;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOFCourse = 600;
	private static int id = 1000;
	
	//
	public Student()
	{
		Scanner sc = new Scanner(System.in);
		logger.log("Enter student First Name: ");
		this.firstName = sc.nextLine();
		
		logger.log("Enter student Last Name: ");
		this.lastName = sc.nextLine();
		
		logger.log(" 1 - Freshmen \n 2 - Junior \n 3 - Senior \n Enter Student Year: ");
		this.year = sc.nextInt();
		
		setStudentID();
	}
	//Generate an ID
	private void setStudentID()
	{
		id++;
		this.studentID = year + " " + id;
	}
	//Enroll in Courses
	public void enroll()
	{
		do {
			logger.log("Enter course to enroll (Q to quit):");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOFCourse; 
			}
			else
			{
				break;
			}
		}
		while (1 != 0);	
	}
	// view balance
	public void viewBalance()
	{
		logger.log("Amount to be paid: $" + tuitionBalance);
		logger.log("------------");
	}
	// payment 
	public void payTuition()
	{
		viewBalance();
		logger.log("Enter the amount to pay for the courses: $");
		Scanner sc =new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		logger.log("Thankyou for your payment of $" + payment);
		viewBalance();
	}
	// status information
	public String toString()
	{
		return " Name : " + firstName + " " + lastName + 
				"\n Year : " + year + 
				"\n Student ID : " + studentID +
				"\n Courses Enrolled : " + courses + 
				"\n Balance : $" + tuitionBalance +
				"\n ------";
	}
}

