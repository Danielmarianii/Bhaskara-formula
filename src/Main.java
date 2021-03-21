import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// delta = Math.pow(b, 2.0) - 4*a*c;
		// x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		// x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("Type the values:");
		Scanner sc = new Scanner(System.in);

		System.out.println("a=");
		double a = sc.nextDouble();
		int a_convert = (int) a;

		System.out.println("b=");
		double b = sc.nextDouble();
		int b_convert = (int) b;

		System.out.println("c=");
		double c = sc.nextDouble();
		int c_convert = (int) c;

		double step1delta = Math.pow(b_convert, 2.0);
		int step1 = (int) step1delta;

		double step2delta = -4 * a * c;
		int step2 = (int) step2delta;

		double delta = Math.pow(b, 2.0) - 4 * a * c;

		System.out.printf("delta= " + step1 + "-4" + "." + a_convert + "." + c_convert + "%n");
		System.out.println("delta= " + step1 + " " + step2);
		System.out.println("delta= " + (int) delta);
		System.out.println();

		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);

		System.out.println("x1= " + (-b_convert) + " " + (Math.sqrt(delta)) + " /2." + a_convert);
		System.out.println("x1= " + ((-b_convert) + (Math.sqrt(delta))) + " /" + 2 * a_convert);
		System.out.println("x1= " + x1);
		System.out.println();

		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("x2= " + (-b_convert) + " " + -(Math.sqrt(delta)) + " /2." + a_convert);
		System.out.println("x2= " + ((-b_convert) - (Math.sqrt(delta))) + " /" + 2 * a_convert);
		System.out.println("x2= " + x2);

		sc.close();

	}

}
