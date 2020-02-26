package bean;

public class Student {
	private static String name;
	private static int id;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Student.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	@Override
	public String toString() {
		return "Student ["+Student.getId()+" "+Student.getName()+"]";
	}
	

}
