package studentRecord2;

public class Runners extends Runner{
	
	public  void registration (int x) {
		count = x;
		for (int num = 0; num < count; num++) {
				do {
					System.out.println("Register student " + (num+1));
			
					stds.setName();
					System.out.println();
					stds.setLevel();
					stds.setYearAdmitted();
					String dept = "";
			
					System.out.println();
					int option = stds.getDept();
					if (option == 1)
						dept = "Science";
					else if (option == 2)
						dept = "Art";
					else if (option == 3)
						dept = "Commercial";
			
				System.out.println("Confirm your details\n");
				System.out.printf(" Name - %s\n Level - %s\n Department - %s\n Year admitted - %d\n\n", stds.getName(), stds.getLevel(), dept, stds.getYearAdmitted());
				System.out.println("1 - Okay\n2 - Edit");
				int select = input.nextInt();
				
				if (select == 1) {
					Operations2 student = new Operations2(stds.getName(), stds.getLevel(), option);
					student.yearAdmitted = stds.getYearAdmitted();
					System.out.println("Enter the scores");
					student.enterScores();
					
					System.out.println("\tRegistration Successful!\nCongratulations " + student.getName() + "\nMatric No.: " + student.getMatricNum());
					System.out.println("********************************");
					matNum[num] = student.getMatricNum();
					noStudents[num] = student;
					counter = false;	
				}
				else
					counter = true;
				} while(counter);
		
			}
	
	}

	
	
	public void checkDept() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.print("Enter matric number: ");
			int maat = input.nextInt();
			System.out.println(stds.getSchoolName());
			for (int x = 0; x < noStudents.length; x++) {
				if (maat == noStudents[x].getMatricNum()) {
					System.out.printf("%s\nDepartment: %s\n", noStudents[x].getName(), noStudents[x].displayDept());
					break;
				}
		}
		}
		
	}
	
	public void checkGpa() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.print("Enter matric number: ");
			int maat = input.nextInt();
			System.out.println(stds.getSchoolName());
			for (int x = 0; x < noStudents.length; x++) {
				if (maat == noStudents[x].getMatricNum()) {
					System.out.printf("%s\nCurrent GPA: %.2f\n", noStudents[x].getName(), noStudents[x].getGpa());
					break;
				}
			}
		}	
		
	}
	
	public void checkYearAdmitted() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.print("Enter matric number: ");
			int maat = input.nextInt();
			System.out.println(stds.getSchoolName());
			for (int x = 0; x < noStudents.length; x++) {
				if (maat == noStudents[x].getMatricNum()) {
					System.out.printf("%s\nYear of Admission: %d\n", noStudents[x].getName(), noStudents[x].getYearAdmitted());
					break;
				}
			}
		}
		
	}
	
	public void checkCurrentLevel() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.print("Enter matric number: ");
			int maat = input.nextInt();
			System.out.println(stds.getSchoolName());
			for (int x = 0; x < noStudents.length; x++) {
				if (maat == noStudents[x].getMatricNum()) {
					System.out.printf("%s\nCurrent Level: %s\n", noStudents[x].getName(), noStudents[x].getLevel());
					break;
				}
			}
			
		}
	}
	
	public void displayAllStudentData() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.println(stds.getSchoolName());
			System.out.println("Matric No   Name\tDept.\t\tLevel");
			for (int x = 0; x < count; x++) {
					System.out.printf("%d     %s\t%s\t\t%sL\n", noStudents[x].getMatricNum(), noStudents[x].getName(), noStudents[x].displayDept(), noStudents[x].getLevel());
					if (noStudents[x].getMatricNum() == 0)
						break;
				
			}
			
		}
	}
	
	public void displayDeptCourses() {
		System.out.println("Select Department\n1 - Science\n2 - Art\n3 - Commercial");
		int dept = input.nextInt();
		if (dept == 1) {
			Departments de = new Departments();
			de.displayCourses("science");
		}
		else if (dept == 2) {
			Departments de = new Departments();
			de.displayCourses("art");
		}
		else if (dept == 3) {
			Departments de = new Departments();
			de.displayCourses("commercial");
		}
		
	}
	
	public void displayallCourses() {
			Departments de = new Departments();
			de.displayCourses("commercial");
			System.out.println();
			de.displayCourses("science");
			System.out.println();
			de.displayCourses("art");
		
			
		
	}
	
	public void checkResult() {
		if (noStudents[0] == null)
			System.out.println("\nYou are yet to register a student");
		else {
			System.out.print("Enter matric number: ");
			int maat = input.nextInt();
			System.out.println("\n\t" + stds.getSchoolName());
			for (int x = 0; x < noStudents.length; x++) {
				if (maat == noStudents[x].getMatricNum()) {
					noStudents[x].displayReports();
					break;
			}
		}
		}
	}


}
