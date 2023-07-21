package exericiselogicalpattern30;

public class F {
	public static void main(String[] args) {
		int A=64;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				if(i%2==0)
				System.out.print(i +" ");
				else
					System.out.print((char)+(A+i) + " ");
				
				
			}
			System.out.println();
			
		}
	}

}
