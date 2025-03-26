package beginner;

public class Student {
	
	private double grade;
	private String address;
	private int id;
	public static int numberOfStudents = 0;
	
	public Student(int grade, String address) {
		this.grade = grade;
		this.address = address;
		this.id = Student.numberOfStudents;
		Student.numberOfStudents++;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

}
