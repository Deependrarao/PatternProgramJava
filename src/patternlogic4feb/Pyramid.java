package patternlogic4feb;

public class Pyramid {
    public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
