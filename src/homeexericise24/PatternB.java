package homeexericise24;

public class PatternB {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i==5 )
					System.out.print(" $ ");
				else if(i==2)
					System.out.print(" @ ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}
	}
}


