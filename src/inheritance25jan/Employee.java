package inheritance25jan;

public class Employee extends Person {
	String desg;
	double salary;
	public Employee() {
		
	}
	public Employee(int id,String name,String add,int mobile,String desg,double salary) {
		super(id, name, add, mobile);
		this.desg = desg;
		this.salary=salary;
	}
	void display() {
		System.out.println(id + " "+name + " "+ add+ " " +mobile + " "+ desg+ " "+salary);
	}

}
