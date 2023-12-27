abstract class ThreeDimentionalShape implements Shape{
	public ThreeDimentionalShape(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	abstract public double getVolume();
	 private String color;
}