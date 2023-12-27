abstract class TwoDimentionalShape implements Shape{
	
	public TwoDimentionalShape(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	 private String color;
}