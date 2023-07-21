package inheritance25jan;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "deep", "pune", 9898989, "me", 70.0f);
		s1.dispaly();
		
		Employee e1 = new Employee(2, "deepu", "gujrat", 989796, "ds", 20000.0f);
		e1.display();
		
	Doctor d1 = new Doctor(3, "deepak", "rajasthan", 998789, "cardio", 2506.0f);
	d1.display();
	}

}
