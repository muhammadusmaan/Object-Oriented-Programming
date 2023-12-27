import java.lang.Math;
public class Cube extends ThreeDimentionalShape{
	public Cube(String color, int length){
		super(color);
		this.length = length;
	}
	public void setLength(int length){
		this.length = length;
	}
	
	public int getLength(){
		return length;
	}
	
	
	public double getArea(){
		return ( 6 * Math.pow(getLength(),2));
	}
	
	public double getVolume(){
		return (  Math.pow(getLength(),3));
	}
	
	public String toString(){
		return "\nSphere:\nColor:	" + getColor() + ", Length:	" + getLength() + ", Area:	" + getArea() + ", Volume:	" + getVolume();
	}
	
	private int length;
}

