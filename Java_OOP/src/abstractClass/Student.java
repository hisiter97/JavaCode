package abstractClass;

/* Student class no longer than an abstract class */
public class Student extends Person{
	private String major;
	
	public Student(String name, String major)
	{
		super(name);
		this.major = major;
	}
	
	public String getDescription()
	{
		return "a student majoring in " + major;
	}
}
