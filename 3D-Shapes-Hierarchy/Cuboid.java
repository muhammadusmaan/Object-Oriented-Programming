import java.lang.Math;
public class Cuboid extends ThreeDimentionalShape{
	
	Cuboid(String color, int length, int width, int height){
		super(color);
		this.length = length;
		this.width = width;
		this.height = height;
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
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return height;
	}
	
	public double getVolume(){
		return getHeight() * getLength() * getWidth();
	}
	
	public double getArea(){
		return ( 2 * ( getHeight() * getWidth() )+ (getLength() * getHeight() ) + ( getWidth() *  getLength()));
	}
	
	public String toString(){
		return "\nCuboid:\nColor:	" + getColor() + ", Length:	" + getLength() +", Width:	" + getWidth() + ", Height:	" + getHeight() + ", Area:	" + getArea() + ", Volume:	" + getVolume();
	}
	
	private int length;
	private int width;
	private int height;
}