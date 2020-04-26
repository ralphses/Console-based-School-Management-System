package studentRecord2;

import java.util.*;
public class Runner {
	static int count = 1000;
	static Scanner input = new Scanner(System.in);
	static Operations2 [] noStudents = new Operations2 [count];
	static int [] matNum = new int [count];
	static boolean counter = true;
	static Operations2 stds = new Operations2();

	public static void main(String[] args) {
		Runners run = new Runners();
		boolean coun = true;
		System.out.println("**WELCOME TO EZE SCHOOL MANAGEMENT SYSTEM**");
		System.out.println("1 - Create Acoount\n2 - Login");
		int acc = input.nextInt();
		if (acc == 1) {
			stds.setSchoolName();
			stds.setNoOfStudent();
			System.out.println();
			System.out.println("\tAccount Creation Completed!!");
			
				}
		else if (acc == 2) {
			System.out.print("Not yet Availale");
			System.exit(0);
				}
		do {
			System.out.println("\n1 - Register Students\n2 - Check Student Result\n3 - "
					+ "Check Student Department\n4 - Check Student current GPA\n5 - Check Student "
					+ "Year of admission\n6 - Check Student current level\n"
					+ "7 - Display all student data\n8 - View courses for a department"
					+ "\n9 - View all departments and courses");
			
			int option = input.nextInt();
			switch(option) {
			case 1: 
				System.out.println("Enter the students and their scores");
				System.out.println();
				
				((Runners) run).registration(stds.getNoOfStudent());
			case 2:
				((Runners) run).checkResult();
				break;
			case 3:
				((Runners) run).checkDept() ;
				break;
			case 4:
				((Runners) run).checkGpa();
				break;
			case 5:
				((Runners) run).checkYearAdmitted();
				break;
			case 6:
				((Runners) run).checkCurrentLevel();
				break;
			case 7: 
				((Runners) run).displayAllStudentData();
				break;
			case 8:
				((Runners) run).displayDeptCourses();
				break;
			case 9: 
				((Runners) run).displayallCourses();
				break;
				default:
					System.out.println("Invalid Option Selected");
					
			} 
			
			System.out.println();
			System.out.println("1 - Perform another operation\n2 - Exit");
			int deci = input.nextInt();
			
			if (deci == 1) {
			}
			
			else if (deci == 2) {
				System.out.println("Goodbye for now!");
				coun = false;
			}
			else {
				System.out.println("Invalid Option");
			}
	
		}
		while (coun);
			}
	
	
}
