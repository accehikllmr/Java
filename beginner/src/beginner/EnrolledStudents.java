package beginner;

public class EnrolledStudents {
	
	private Student[] sts;
	private final int MAX = 200;
	private int no_sts;
	
	public EnrolledStudents() {
		this.sts = new Student[MAX];
	}
	
	public void addStudent(Student s) {
		this.sts[this.no_sts] = s;
		this.no_sts++;
	}
	
	private int indexOf(int id) {
		int index = -1;
		for (int i = 0; i < no_sts; i++) {
			if(sts[i].getID() == id) {
				index = i;
			}
		}
		return index;
	}
	
	public boolean studentExists(int id) {
		return (indexOf(id) >= 0);
	}
	
	public void changeGradeOf(int id, double g) {
		if (studentExists(id)) {
			sts[id].setGrade(g);
		}
	}
	
	public void changeAddressOf(int id, String a) {
		if (studentExists(id)) {
			sts[id].setAddress(a);
		}
	}

}
