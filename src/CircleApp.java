import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			
		System.out.println("Welcome to the circle tester");
		
		
		
		String prompt = "Enter radius: ";
		System.out.println();
		double ra=Validator.getDouble(sc,prompt);
		Circle cir1 = new Circle(ra);
		
		System.out.println("Circumference: " + cir1.getFormattedCircumference());
		System.out.println("Area: " + cir1.getFormattedArea());
		cont = Validator.getString(sc, "Continue? (y/n)");
		
		
		}
		System.out.println("Goodbye.You created " + Circle.objectCount + " Circle object(s)." );
		
		
	}

}
