
class Student implements Cloneable {
Student Data;
	private Student left, right;
	private String  lastname;
	String home;
	String program;
	String number;
	char year;

	public  Student(String number, String name, String home, String program, char year)
	{
		this.number  = number;
		this.setLastname(name);;
		this.home = home;
		this.program = program; 
		this.year = year;
		setLeft(null);
        setRight(null);
	}
	
	public String toString()
	{
		String s="StudentID| " + number + ", LastName| " + getLastname() + ", Department| " + home + 
						", Program| " + program + ", CourseYear| " + year;
		return s;
	}
 
	@Override
    public Object clone() throws CloneNotSupportedException{
        Student temp = (Student)super.clone();
        temp.setLeft(null);
        temp.setRight(null);
        return temp;
    }

	public Student getLeft() {
		return left;
	}

	public void setLeft(Student left) {
		this.left = left;
	}

	public Student getRight() {
		return right;
	}

	public void setRight(Student right) {
		this.right = right;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}

