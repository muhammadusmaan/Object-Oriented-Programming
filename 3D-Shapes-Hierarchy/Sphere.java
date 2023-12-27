import java.lang.Math;
public class Sphere extends ThreeDimentionalShape{
	public Sphere(String color, int radius){
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
		return (4 * Math.PI * Math.pow(getRadius(), 2));
	}
	
	public double getVolume(){
		return (4/3.0 * Math.PI * Math.pow(getRadius(),3));
	}
	
	public String toString(){
		return "\nSphere:\nColor:	" + getColor() + ", Radius:	" + getRadius() + ", Area:	" + getArea() + ", Volume" + getVolume();
	}
	
	private int radius;
}