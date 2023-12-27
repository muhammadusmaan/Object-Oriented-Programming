

import java.util.ArrayList;


public class DogTest {
	public static void main(String[] args){
		double sum = 0;
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Labrador("Daisy", "black", 30));
		dogs.add(new Yorkshire("Max ", "white", 31));
		dogs.add(new Labrador("Jake ", "yellow", 32));
		dogs.add(new Yorkshire("Molly ", "chocolate", 33));
		dogs.add(new Labrador("Bailey ", "black", 34));
		
		for(Dog dog: dogs){
			System.out.println(dog);
		}
		for(Dog dog: dogs){
			sum = sum + dog.getBreadWeight();
		}
		System.out.println(sum/dogs.size());
	}
}
