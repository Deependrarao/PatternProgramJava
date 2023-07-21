package inheritance25jan;

public class Doctor extends Person {
	String spec;
	float fees;
	public Doctor() {
		
	}
	public Doctor(int id, String name, String add, int mobile,String spec,float fees) {
		super(id, name, add, mobile);
		this.spec= spec;
		this.fees = fees;
	}
	void display() {
		System.out.println(id + " "+name + " "+ add+ " " +mobile + " "+ spec+ " "+fees);
	}
		
	

}
