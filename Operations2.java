package studentRecord2;

import java.util.*;

public class Operations2 {
	MatricNumber mat = new MatricNumber();
	Departments dept = new Departments(); // The dept object belongs to the Departments class where the several departments is housed
	// It is used to access methods of the Department class
/*
* The following constructor is used to initialize all the components of a student in this particular school
*/

	
	private String name; // Name of a student
	private String level; // Current year of study
	private String department; // Current department
	public int yearAdmitted;
	private int matricNum;
	private String schoolName;
	private double scores[] = new double [dept.noOfCourses(department)]; // scores for each course in a department
	private String[] courses; // Courses for the student
	private int[] units; // credit units for each courses
	private int[] gp; // grade points for each points
	private int[] gradeValue; // This is an array to store the grade values for each grade
	private char[] grades; // This stores the grades from A to F
	public String[] remark; // This stores remarks based on the grades on each course e.g Excellent for A
	private int u; // Just a counter value
	private int option; // Just another counter value
	private int noOfStudents;
	
	
	Scanner input = new Scanner(System.in);
	
	
	
	public Operations2() {
				
	}
	
	public Operations2(String name, String level, int option) {
		this.option = option;
		this.name = name;
		this.level = level;
		this.yearAdmitted = getYearAdmitted();
		this.department = setDept(option);
		this.setMatricNum(mat.insertMatricNumber());
		this.courses = dept.getCourses(department); // This gets the list of courses to be offered by a student according to his/her department
		this.units = dept.getUnits(department); // // This gets the credit units for each of course to be offered by a student according to his/her department
		this.grades = new char[dept.noOfCourses(department)]; // This initializes the an array of a number grades for each course. This figure is dependent on the department
		this.remark = new String[dept.noOfCourses(department)]; // This initializes an array that will store remarks based on the department as well 
		this.gp = new int[dept.noOfCourses(department)]; // This initializes an array that will store the grade points (GP) for each course, this is also based on the department
		this.gradeValue = new int[dept.noOfCourses(department)]; // Then this is for grade value
		//this.setMatricNum(mat.insertMatricNumber());
		
		
	}
	
	public int getMatricNum() {
		return matricNum;
	}
	
	public double getTotalScore() {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i]; 
		}
		return sum;
	}
	
	public double getAverage() {
		return getTotalScore() / (dept.noOfCourses(department));
	}

	public void setMatricNum(int matricNum) {
		this.matricNum = matricNum;
	}
	
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName() {
		System.out.print("School Name: ");
		this.schoolName = input.nextLine();
	}
	
	public String displayDept() {
		return department;
	}

	
	public String getName() {
		return name;
	}

	public void setName() {
		System.out.print("First name: ");
		String firstName = input.next();
		System.out.print("Second name: ");
		String secondName = input.next();
		this.name = firstName + " " + secondName;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel() {
		System.out.print("Enter level: ");
		this.level = input.next();
	}
	
	public int getNoOfStudent() {
		return noOfStudents;
	}

	public void setNoOfStudent() {
		System.out.print("Number of students: ");
		this.noOfStudents = input.nextInt();
	}
	
	public int getYearAdmitted() {
		return yearAdmitted;
	}

	public void setYearAdmitted() {
		System.out.print("Enter year of admission: ");
		this.yearAdmitted = input.nextInt();
	}

	
	public void enterScores() {
		this.scores = new double[dept.noOfCourses(department)];
		for (int i = 0; i < scores.length; i++) {
			System.out.print(dept.enterCourses(department)[i] + " : ");
			scores[i] = input.nextDouble();
			grades[i] = setGrade(scores[i]);
			remark[i] = setRemark(scores[i]);
			gradeValue[i] = setGp(grades[i]);
			gp[i] = getGp(gradeValue[i], units[i]);
		}
		
	}
	
	public double getGpa() {
		return sumGp() / sumUnits();
	}
	
	public int getDept() {
		System.out.println("Choose Department\n1 - Science\n2 - Art\n3 - Commercial");
		option = input.nextInt();
		
		return option;
		
	}
	
		
	private String setDept(int opt) {
		if (opt == 1) {
			department = "Science";
		}
		else if (opt == 2) {
			department = "Art";
		}
		else if (opt == 3) {
			department = "Commercial";
		}
		
		return department;
		
	}
	
	
	
	private double sumGp() {
		double sum = 0;
		for (int x = 0; x < gp.length; x++) {
			sum = sum + gp[x];
		}
		return sum;
	}
	
	private double sumUnits() {
		double sum = 0;
		for (int x = 0; x < units.length; x++) {
			sum = sum + units[x];
		}
		return sum;
	}
		
	private char setGrade(double score) {
		char miniGrade = '.';
		
		if (score >= 0 && score <= 29)
				miniGrade = 'F';
		
		else if (score > 29 && score <= 39)
				miniGrade = 'E';
		
		else if (score > 39 && score <= 49)
				miniGrade = 'D';
		
		else if (score > 49 && score <= 59)
				miniGrade = 'C';
		
		else if (score > 59 && score <= 69)
				miniGrade = 'B';
		
		else if (score > 69 && score <= 100)
				miniGrade = 'A';
		else
			miniGrade = '.';
		
		return miniGrade;
	}
	
	private String setRemark(double score) {
		String remarks = "";
		
		if (score >= 0 && score <= 29)
				remarks = "Fail";
		
		else if (score > 29 && score <= 39)
				remarks = "Pass";
		
		else if (score > 39 && score <= 49)
				remarks = "Not too good";
		
		else if (score > 49 && score <= 59)
				remarks = "Good";
		
		else if (score > 59 && score <= 69)
				remarks = "Very Good";
		
		else if (score > 69 && score <= 100)
				remarks = "Excellent";
		else
				remarks = "invalid score entered";
		
		return remarks;
	}
		
	private int getGp(int num, int num2) {
		return num * num2;
	}
	
	
	private int setGp(char miniGrade) {
		
		if (miniGrade == 'F') 
			this.u = 0;
		else if (miniGrade == 'E') 
			this.u = 1;
		else if (miniGrade == 'D') 
			this.u = 2;
		else if (miniGrade == 'C') 
			this.u = 3;
		else if (miniGrade == 'B') 
			this.u = 4;
		else if (miniGrade == 'A') 
			this.u = 5;
		else
			this.u = 0;
		return this.u;
	}
	
	
	
	public void displayReports() {
		System.out.println("\t***FIRST SEMESTER RESULTS***");
		
		System.out.printf("\t\t\tMatric No. %d\n", getMatricNum());
		System.out.printf("Admission year %d\n", yearAdmitted);
		System.out.printf("Name: %s \n", name);
		System.out.printf("Level: %s \n\n", level);
	
		System.out.println("S/N\tCOURSES\tSCORES\tGRADES\tREMARKS");
		for (int x = 0; x < courses.length; x++) {
			if (courses[x] == null) 
				System.out.printf("%d - Empty\n", x+1);
			else
				System.out.printf("%d\t%s\t%.2f\t%c\t%s\n", x+1, courses[x], scores[x], grades[x], remark[x]);
		}
		
		System.out.printf("Total: %.2f\n", getTotalScore());
		System.out.printf("Average: %.2f\n", getAverage());
		System.out.printf("GPA: %.2f\n", getGpa());
		System.out.println("NOTE: All Failed Courses must be re-taken");
	}

	
	
}
