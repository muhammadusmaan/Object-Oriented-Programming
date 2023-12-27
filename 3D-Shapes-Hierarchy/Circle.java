import java.lang.Math;
class Circle extends TwoDimentionalShape{
	private int radius;
	
	public Circle(String color, int radius){
		super(color);
		this.radius = radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(getRadius(),2);
	}
	
	public String toString(){
		return "\nCircle:\nColor:	" + getColor() + ", Radius:	" + getRadius() + ", Area:	" + getArea();
	}
}