package exericiselogicalpattern24;

public class PatternG {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=10; j++) {
				if(j<=3 || j>=7)
					System.out.print(+j+ " " );
				else
					System.out.print(" * ");
							
			}
			System.out.println();
		}
	}

}
