package exericse25jan;

public class C {
	public static void main(String[] args) {

		// 200
		// 400 600
		int k=2;
			for (int i = 2; i <= k; i++) {// rows
				for (int j = 2; j <= 2; j++) { // coloum
					System.out.print(i * 100 + "\n" + i * 200 + " " + i * 300);
				}

			}


			for (int i = 1; i <= k+1; i++) {// rows
				for (int j = 3; j <= i; j++) { // coloum
					System.out.print(i * 100 + "\n" + i * 200 + " " + i * 300+" "+i*400);
				}
				System.out.println();
			}


			//400
			//800 1200 1600 2000
			for (int i = 1; i <= k+2; i++) {// rows
				for (int j = 4; j <= i; j++) { // coloum
					System.out.print(i * 100 + "\n" + i * 200 + " " + i * 300+" "+i*400+" "+i*500);
				}
				System.out.println();
			}

		
	}
}