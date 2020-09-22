package person;

public class person {

	String name;
	int age;
	String job_title;
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", job_title=" + job_title + "]";
	}
	public person(String name, int age, String job_title) {
		super();
		this.name = name;
		this.age = age;
		this.job_title = job_title;
	}
	
	
	
	
	
}
