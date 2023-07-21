package exericiselogicalpattern30;

public class G {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5;j++) {
				if(i==1) {
					System.out.print(2*j + " ");
				}
				else if(i==2) {
					System.out.print(3*j + " ");
				}
				else {
					System.out.print(4*j +" ");
				}

			}System.out.println();
		}
	}
}
