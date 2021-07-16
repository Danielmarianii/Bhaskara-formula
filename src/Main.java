import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// project delta = Math.pow(b, 2.0) - 4*a*c;
		// x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		// x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("Type the values:");
		Scanner sc = new Scanner(System.in);

		System.out.print("a=");
		double a = sc.nextDouble();
		int a_int = (int) a;

		System.out.print("b=");
		double b = sc.nextDouble();
		int b_int = (int) b;

		System.out.print("c=");
		double c = sc.nextDouble();
		int c_int = (int) c;

		double step1delta = Math.pow(b_int, 2.0);
		int step1 = (int) step1delta;

		double step2delta = -4 * a * c;
		int step2 = (int) step2delta;

		double delta = Math.pow(b, 2.0) - 4 * a * c;
		
		
		System.out.printf("delta= " + step1 + "-4" + "." + a_int + "." + c_int + "%n");
		System.out.println("delta= " + step1 + " " + step2);
		
		double x1 =0;
		double x2=0;
		if (delta < 0) {
			System.out.printf("delta= " + (int)delta + "%nImpossible to resolve with a negative delta.");
		}

		else {
			System.out.println("delta= " + (int) delta);
			System.out.println();
	
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
	
			System.out.println("x1= " + (-b_int) + " " + (Math.sqrt(delta)) + " /2." + a_int);
			System.out.println("x1= " + ((-b_int) + (Math.sqrt(delta))) + " /" + 2 * a_int);
			System.out.println("x1= " + x1);
			System.out.println();
	
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	
			System.out.println("x2= " + (-b_int) + " " + -(Math.sqrt(delta)) + " /2." + a_int);
			System.out.println("x2= " + ((-b_int) - (Math.sqrt(delta))) + " /" + 2 * a_int);
			System.out.println("x2= " + x2);
		}
		sc.close();

	}

}
