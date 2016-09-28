import java.lang.Math;
public class Circle {

	//Instantiate Instant variable
	public double Circumference;
	public String FormattedCircumference;
	public double Area;
	public String FormattedArea;
	public double radius;
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
		return Math.PI * radius *radius;
	}

	public double getDiameter(){
		return radius *2;
	}
	
	public double getCircumference(){
		return 2 * Math.PI * radius;
	}
	
	




}