package exericiselogicalpattern24;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1; j<=6; j++) {
				if(j<=5)
					System.out.print("* ");
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
	}

}
