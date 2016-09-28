import java.lang.Math;
public class Circle {

	//Instantiate Instant variable
	public double Circumference;
	public String FormattedCircumference;
	public double Area;
	public String FormattedArea;
	public double radius;
	private double PI = 3.14;
	public double diameter;
	
	//Constructor 
	public Circle(double ra) {
		radius = ra;
	}
	//Set methods
	public void setRadius(double ra){
		radius = ra;
	}
	
	public double getRadius(){
	return radius;
	}
	
	public double getArea(){
		return PI * radius *radius;
	}

	public double getDiameter(){
		return radius *2;
	}
	
	public double getCircumference(){
		return 2 * PI * radius;
	}
	
	




}