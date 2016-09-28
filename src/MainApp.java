import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//double ra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the circle tester");
		System.out.println("Enter radius: ");
		double ra=sc.nextDouble();
		Circle cir1 = new Circle(ra);
		
		System.out.println(cir1.getCircumference());
		
		
	}

}
