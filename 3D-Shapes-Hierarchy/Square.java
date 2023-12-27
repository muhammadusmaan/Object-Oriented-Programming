import java.lang.Math;
class Square extends TwoDimentionalShape{
	
	public Square(String color, int length, int width){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	
	public double getArea(){
		return getLength() * getWidth();
	}
	
	public String toString(){
		return "\nSquare:\nColor:	" + getColor() + ", Length:	" + getLength() + ", Width:	" + getWidth() + ", Area:	" + getArea();
	}
	
	private int length;
	private int width;
}