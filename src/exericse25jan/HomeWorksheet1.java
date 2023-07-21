package exericse25jan;
import java.util.*;
public class HomeWorksheet1 {
	public static void main(String[] args) {
		//accept a number and find it is Even No .
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) 
			System.out.println("Number is even = "+a);


		//accept a number and find it is odd No .
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2!=0)
			System.out.println("Number is odd = "+a);


               //accept a number and find it is Even No or Odd No.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) 
			System.out.println("Number is even = "+a);
		else
			System.out.println("Number is odd = "+a);
 


		//accept a number and find it Zero, Positive or Negative.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("Number is Positive = "+a);
		}
		else if(a==0) {
			System.out.println("Number is Zero = "+a);
		}
		else {
			System.out.println("Number is Negative = "+a);
		}

               
      
                //accept two number and find smallest no.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b)
			System.out.println("Number is Smallest = "+a);
		else
			System.out.println("Number is Smallest = "+b);



                 //accept two number and find find largest no.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
			System.out.println("Number is largest = "+a);
		else
			System.out.println("Number is largest = "+b);	

 

		//accept a two number and find sum of Two even No.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%2==0 && b%2==0) {
			int sum = a+b;
			System.out.println("Addition of Even number ="+sum );
		}



		// accept a two number and find sum of Two odd No.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%2!=0 && b%2!=0) {
			int sum = a+b;
			System.out.println("Addition of odd number =" +sum );
		}



		//accept a two number and find sum of even or odd
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a%2==0 || b%2==0 || a%2!=0 || b%2!=0) {
			int sum = a+b;
			System.out.println("Addition of even or odd number =" +sum );
		}



                //accept a day of week(int) and display the weekday
		//(e.g – day=4  Thursday) (use switch case)
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch (day) {
		case 1:System.out.println("Monday is weekday");
			break;
		case 2:System.out.println("Tuesday is weekday");
		break;
		case 3:System.out.println("Wednesday is weekday");
		break;
		case 4:System.out.println("Thursday is weekday");
		break;
		case 5:System.out.println("Friday is weekday");
		break;
		case 6:System.out.println("Saturday is weekend");
		break;
		case 7:System.out.println("Sunday is weekend");
		break;
		default:
			System.out.println("invalid day");
			break;
		}*/



		//create Menu driven program for Arithmetic Operation
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter a number ");
		System.out.println(a+ " "+b);
		System.out.println("Enter a choice ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1: 
			int c = a+b;
			System.out.println("Addition of two number = "+c);
		case 2: 
			int d = a-b;
			System.out.println("subtration of two number = "+d);	
			break;
		case 3: 
			int e = a*b;
			System.out.println("multipication of two number = "+e);	
			break;
		case 4: 
			int f = a/b;
			System.out.println("division of two number = "+f);	
			break;
		case 5: 
			int g = a%b;
			System.out.println("mod of two number = "+g);	
			break;

		default:
			System.out.println("invalid choice");
			break;
		}
	}	
}




