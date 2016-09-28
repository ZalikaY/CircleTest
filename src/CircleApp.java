import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			
		System.out.println("Welcome to the circle tester");
		
		String prompt = "Enter radius: ";
		System.out.println(prompt);
		double ra=sc.nextDouble();
		Circle cir1 = new Circle(ra);
		
		System.out.println("Circumference: " + cir1.getFormattedCircumference());
		System.out.println("Area: " + cir1.getFormattedArea());
		System.out.println("Continue? (y/n)");
		cont = sc.next();
		
		
		}
		System.out.println("Goodbye.You created " + Circle.objectCount + " Circle object(s)." );
		
		
	}

}
