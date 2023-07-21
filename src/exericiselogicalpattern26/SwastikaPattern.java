package exericiselogicalpattern26;

public class SwastikaPattern {
	
	//swastik code for any number
	public static void main(String[] args) {
		int num = 12;
		if(num%2==0)
			num= num+1;
		int Mid = (num+1)/2;
 		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num; j++) {
			 if((i==Mid || j==Mid)||
					 (i==1 && j>Mid)||
					 (i==num && j<Mid)||
					 (j==1 && i<Mid)||
					 (j==num && i>Mid)) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
}
