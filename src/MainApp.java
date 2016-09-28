import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			
		System.out.println("Welcome to the circle tester");
		
		
		System.out.println("Enter radius: ");
		double ra=sc.nextDouble();
		Circle cir1 = new Circle(ra);
		
		System.out.println("Circumference: " + cir1.getCircumference());
		System.out.println("Area: " + cir1.getArea());
		System.out.println("Continue? (y/n)");
		cont = sc.next();
		
		System.out.println("Goodbye.You created " + cir1.getObjectCount );
		}
		
		
	}

}
