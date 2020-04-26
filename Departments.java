package studentRecord2;

public class Departments {
	private String [] courses;
	private int [] units;
	private int num;
	
	
	
	private String[] scienceCourses() {
		String[]courses = {"Maths", "English", "CSC", "Agric", "Bio"};
		return courses;
	}
	
	private String[] artCourses() {
		String[] courses = {"Gov't", "Lit", "SOS", "Agric", "Eng", "Bio"};
		return courses;
	}
	
	private String[] comCourses() {
		String[] courses = {"Maths", "English", "Comm", "Acct", "B.Keep"};
		return courses;
	}
	
	private int[] scienceUnits() {
		int[] units = {3, 2, 3, 2, 3};
		return units;
	}
	
	private int[] artUnits() {
		int[] units = {3, 3, 2, 2, 2, 3};
		return units;
	}
	
	private int[] comUnits() {
		int[] units = {3, 2, 4, 3, 3};
		return units;
	}
	
	public void displayCourses(String dept) {
		String dep = dept;
		
		if (dep == "science" || dep == "Science" || dep == "SCIENCE") {
			courses = scienceCourses();
			units = scienceUnits();
			
			System.out.println("SCIENCES COURSES");
			System.out.println("Course\tUnits");
			for (int x = 0; x < courses.length; x++) {
				System.out.printf("%s\t%d\n", courses[x], units[x]);
			}
		}
		else if (dep == "art" || dep == "Art" || dep == "ART") {
			courses = artCourses();
			units = artUnits();
			
			System.out.println("ART COURSES");
			System.out.println("Course\tUnits");
			for (int x = 0; x < courses.length; x++) {
				System.out.printf("%s\t%d\n", courses[x], units[x]);
			}
		}
		
		else if (dep == "commercial" || dep == "Commercial" || dep == "COMMERCIAL") {
			
			courses = comCourses();
			units = comUnits();
			
			System.out.println("COMMERCIAL COURSES");
			System.out.println("Course\tUnits");
			for (int x = 0; x < courses.length; x++) {
				System.out.printf("%s\t%d\n", courses[x], units[x]);
			}
		}	
	}
	
	public String[] enterCourses(String dept) {
		String dep = dept;
	
		if (dep == "science" || dep == "Science" || dep == "SCIENCE") {
			courses = scienceCourses();
		}
		else if (dep == "art" || dep == "Art" || dep == "ART") {
			courses = artCourses();
		}
		
		else if (dep == "commercial" || dep == "Commercial" || dep == "COMMERCIAL") {
			courses = comCourses();
		}	
		return courses;
	}
	
	public String[] getCourses(String dept) {
		String dep = dept;
	
		if (dep == "science" || dep == "Science" || dep == "SCIENCE") {
			courses = scienceCourses();
		}
		else if (dep == "art" || dep == "Art" || dep == "ART") {
			courses = artCourses();
		}
		
		else if (dep == "commercial" || dep == "Commercial" || dep == "COMMERCIAL") {
			courses = comCourses();
		}	
		return courses;
	}
	
	public int[] getUnits(String dept) {
		
		String dep = dept;
	
		if (dep == "science" || dep == "Science" || dep == "SCIENCE") {
			this.units = scienceUnits();
		}
		else if (dep == "art" || dep == "Art" || dep == "ART") {
			this.units = artUnits();
		}
		
		else if (dep == "commercial" || dep == "Commercial" || dep == "COMMERCIAL") {
			this.units = comUnits();
		}	
		return this.units;
	}

	
	public int noOfCourses(String depp) {
		
		if (depp == "art" || depp == "Art" || depp == "ART")
			this.num = 6;
		else if (depp == "science" || depp == "Science" || depp == "SCIENCE")
			this.num  = 5;
		else if (depp == "commercial" || depp == "Commercial" || depp == "COMMERCIAL")
			this.num  = 5;
		else
			num =0;
		return this.num;
		
	}
		

}
