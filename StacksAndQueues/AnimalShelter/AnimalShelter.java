import java.util.*;

public class AnimalShelter {

	LinkedList<Animal> stack;

	public AnimalShelter() {

		stack = new LinkedList<>();
	}


	public void enqueue(Animal input) {

		stack.addLast(input);
	}

	public Animal dequeueAny() {

		return stack.removeFirst();
	}

	public Animal dequeueDog() {

		int stackSize = stack.size();
		int i = 0;

		while(i < stackSize && stack.get(i) instanceof Cat) {

			i++;
		}

		if(i >= stackSize) return null;

		return stack.remove(i);
	}

		public Animal dequeueCat() {

		int stackSize = stack.size();
		int i = 0;

		while(i < stackSize && stack.get(i) instanceof Dog) {

			i++;
		}

		if(i >= stackSize) return null;

		return stack.remove(i);
	}

	public static void main(String[] args) {

		AnimalShelter testInstance = new AnimalShelter();

		Dog firstDog = new Dog();
		Dog secondDog = new Dog();
		Dog thirdDog = new Dog();
		Cat firstCat = new Cat();
		Cat secondCat = new Cat();

		testInstance.enqueue(firstDog);
		testInstance.enqueue(secondDog);
		testInstance.enqueue(thirdDog);
		testInstance.enqueue(firstCat);
		testInstance.enqueue(secondCat);

		System.out.println(testInstance.dequeueCat().type);

	} 
 }