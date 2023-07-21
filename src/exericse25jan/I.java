package exericse25jan;
import java.util.*;
public class I {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	for(int i=1; i<=8; i++) {
		int display = i*n*100;
		if(i>1) {
			System.out.print(display+ " ");
		}
		else {
			System.out.println(display);
		}
	}
	}

}
