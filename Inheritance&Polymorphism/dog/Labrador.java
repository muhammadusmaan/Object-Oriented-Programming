
public class Labrador extends Dog {

	
	public Labrador() {
		
	}
	public Labrador(String a, String b, int c){
		super(a, b, c);
	}
 
	public String speak(){
		return super.getName() +  ": woof";
	}
	
}
