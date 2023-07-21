package exericse25jan;

public class Pattern_Swastik {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5; j++) {
				System.out.print("(" + i + "," + j + ")");
			}

			System.out.println();

		}
		
		System.out.println("---------------------------------------");

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5; j++) {
				if (i == j || i + j == 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}

		System.out.println("---------------------------------------");

		// star pattern
		// aplhabet pattern
		// number pattern


		for (int i = 1; i <= 3; i++) { // rows

			for (int j = 1; j <= 3; j++) {
				if (i == j || i+j==4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}

		System.out.println("---------------------------------------");

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}

			System.out.println();

		}

		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}

			System.out.println();

		}

		System.out.println("-------------------------------");
		for (int i = 1; i <= 5; i++) { // rows

			for (int j = 1; j <= 4; j++) {
				if (j == 1) {
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
				if (i == 5 || j == 5 || i == 1) {
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
