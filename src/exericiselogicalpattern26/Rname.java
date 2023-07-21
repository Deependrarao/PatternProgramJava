package exericiselogicalpattern26;

public class Rname {
	public static void main(String[] args) {
		for(int i=1 ; i<=6; i++) {
			for(int j= 1; j<=5; j++) {
				if(j==1 || i==1 ||  j==5 && i<=3 || i==3 || i==4 && j==2 || i==5 &&  j==3 || i==6 && j==4   )
				System.out.print(" * ");
				else
					System.out.print("   ");
				
			}
			System.out.println();
		}
	}
}
