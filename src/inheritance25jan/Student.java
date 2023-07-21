package inheritance25jan;

public class Student extends Person {
	String course;
	float per;
	public Student() {

	}
	public Student(int id,String name,String add,int mobile,String course, float per) {
		super(id, name, add, mobile);

		this.course = course;
		this.per= per;
	}
	void dispaly() {
		System.out.println(id + " "+name + " "+ add+ " " +mobile + " "+ course+ " "+per) ;

	}



}



