package exericse25jan;

public class Swastik{
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // rows
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) { // rows
			for (int j = 1; j <= 5; j++) {
				if (i == 5 || j == 5 || i == 1 || j==4 || i==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 4; j++) {
				if (j == 4 || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}



