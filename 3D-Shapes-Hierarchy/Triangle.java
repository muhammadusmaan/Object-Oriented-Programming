import java.lang.Math;
class Triangle extends TwoDimentionalShape{
	public Triangle(String color, int base, int length){
		super(color);
		this.base = base;
		this.length = length;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}
	public void setBase(int base){
		this.base = base;
	}
	public int getBase(){
		return base;
	}
	
	public double getArea(){
		return (getLength() * getBase())/2;
	}
	
	public String toString(){
		return "\nTriangle:\nColor:	" + getColor() + ", Length:	" + getLength() + ", Base:	" + getBase();
	}
	
	private int base;
	private int length;
}