import java.util.ArrayList;
import java.util.Iterator;
public class Driver{
	public static void main(String[] args){
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle("red", 5));
		shapes.add(new Triangle("black", 5, 15));
		shapes.add(new Triangle("blue", 5, 52));
		shapes.add(new Sphere("Pink", 5));
		shapes.add(new Cuboid("black", 5, 15, 10));
		shapes.add(new Cube("blue", 5));
	
	// to display all objects details as said in lab
		System.out.println(shapes);
		
		for(int a=0; a<shapes.size(); a++){
			if( shapes.get(a) instanceof TwoDimentionalShape){
				System.out.println("Two Dimentional Shape");
				//TwoDimentionalShape tds = (TwoDimentionalShape)shapes.get(a);
				
				System.out.println("Color:	" + ((TwoDimentionalShape)shapes.get(a)).getColor());
				System.out.println("Area:	" + ((TwoDimentionalShape)shapes.get(a)).getArea());
				System.out.println("");
			}
			else if( shapes.get(a) instanceof ThreeDimentionalShape){
				System.out.println("Three Dimentional Shape");
				//ThreeDimentionalShape tds1 = (ThreeDimentionalShape)shapes.get(a);
				
				System.out.println("Color:	" + ((ThreeDimentionalShape)shapes.get(a)).getColor());
				System.out.println("Volume:	" + ((ThreeDimentionalShape)shapes.get(a)).getVolume());
				System.out.println("Area:	" + ((ThreeDimentionalShape)shapes.get(a)).getArea());
				;System.out.println("");
			}
		}
		
		
	}
}