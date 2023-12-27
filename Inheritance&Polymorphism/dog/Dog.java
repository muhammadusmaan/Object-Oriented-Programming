
public  class Dog {
protected String name;
private String color;
private int breadWeight;
	
	
	public Dog(String name, String a, int b){
		this.name = name;
		color = a;
		breadWeight = b ;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setBreadWeight(int breadWeight){
		this.breadWeight = breadWeight;
	}
	
	public int getBreadWeight(){
		return breadWeight;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String speak(){
		return "woof";
	}
	
	
}






