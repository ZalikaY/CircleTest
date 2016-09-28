import java.lang.Math;
public class Circle {

	//Instantiate Instant variable
	public static int objectCount=0;
	public double Circumference;
	public String FormattedCircumference;
	public double Area;
	public String FormattedArea;
	public double radius;
	public double diameter;
	
	//Constructor 
	public Circle(double ra) {
		radius = ra;
		objectCount++;
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
	
	public String getFormattedCircumference() {
		double cirF = getCircumference() ;
		return String.format("%.2f", cirF);	
	}

	public String getFormattedArea() {
		double areF = getArea() ;
		return String.format("%.2f" , areF);
	}
	
		
	


//Static because it's shared with all instances
public static int getObjectCount(){
	return objectCount;
}
	

}



