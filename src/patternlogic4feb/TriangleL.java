package patternlogic4feb;

public class TriangleL {
	public static void main(String[] args) {
		//lower side right triangle left side
		
		int n =5;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}

