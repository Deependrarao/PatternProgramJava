package exericiselogicalpattern24;

public class PatternM {
	public static void main(String[] args) {
		int n= 987654321;
		while(n>0) {
			int r = n%10;
			n= n/10;
			for(int i=1; i<=r; i++) {
				System.out.print(+r+" ");

			}

			System.out.println();

		}
	}
}



