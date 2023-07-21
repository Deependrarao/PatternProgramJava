package exericiselogicalpattern24;

public class PatternE {
	public static void main(String[] args) {
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=4; j++) {
				if(i==1 && j==1 || i==2 && j==2 || i==3 && j==3 || i==4 && j==4)
					System.out.print(" @");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
	}

}
