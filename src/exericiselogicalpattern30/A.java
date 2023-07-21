package exericiselogicalpattern30;

public class A {
	public static void main(String[] args) {
		for(int i= 1; i<=5;i++) {
			for(int j=1; j<=3; j++) {
				if(i%2==0)
				System.out.print("* ");
				else
					System.out.print( i +" ");
			}
			System.out.println();
		}
	}

}
