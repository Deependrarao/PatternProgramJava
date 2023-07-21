package patternlogic4feb;

public class StarTriangle {
	//right triangle left side side 
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
