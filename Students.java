package studentRecord2;
import java.util.*;
public class Students {
	Scanner input = new Scanner(System.in);
	
	private String name;
	private String department;
	private String level;
	private int yearAdmitted;
	
	
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
	
	
	public String getName() {
		System.out.print("Enter name : ");
		String name = input.nextLine();
		return name;
	}
	
	public String getLevel() {
		System.out.print("Enter level : ");
		String level = input.nextLine();
		return level;
	}
	
	public String getDept(int num) {
		
		return setDept(num);
	}
	
	private int getYearAdmitted() {
		System.out.print("Enter year of admission");
		int yearAdmitted = input.nextInt();
		return yearAdmitted;
	}
	
	public void getInfo(int num) {
		System.out.print("Enter Your details");
		this.name = getName();
		this.level = getLevel();
		System.out.println("Select Department\n1 - Science\n2 - Art\n3 - Commercial");
		int option = input.nextInt();
		this.department = getDept(option);
		this.yearAdmitted = getYearAdmitted();
	}
	
	public int confirmInfo() {
		System.out.println("Confirm your details");
		System.out.printf("Name - %s\n Level - %s\n Department - %s\nYear Admitted - %d", name, level, department, yearAdmitted);
		System.out.println("1 - Okay\n2 - Edit");
		int select = input.nextInt();
		return select;
	}
	
	

}
