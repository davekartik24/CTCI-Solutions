
import java.util.*;

public class SortStackWithJugglingBetweenStackOnPush {

	ArrayDeque<Integer> mainStack;
	ArrayDeque<Integer> secondStack;

	public SortStack() {

		mainStack = new ArrayDeque<>();
		secondStack = new ArrayDeque<>();
	}

	public int peek() {

		return mainStack.peek();
	}

	public int pop() {

		return mainStack.pop();
	}

	public void push(int input) {

		if(mainStack.peek() != null && mainStack.peek() < input) {
			while(!mainStack.isEmpty() && mainStack.peek() < input) {

				secondStack.push(mainStack.pop());
			}

			mainStack.push(input);

			while(!secondStack.isEmpty()) {
				mainStack.push(secondStack.pop());
			}
		} else {

			mainStack.push(input);
		}
	}

	public void toDisplay() {

		while(!mainStack.isEmpty()) {

			System.out.println(mainStack.peek());
			secondStack.push(mainStack.pop());

		}

		while(!secondStack.isEmpty()) {

			mainStack.push(secondStack.pop());
		}
	}
 
	public static void main(String[] args) {

		SortStack testInstance = new SortStack();

		testInstance.push(6);
		testInstance.push(4);
		testInstance.push(1);		
		testInstance.push(9);
		testInstance.push(3);
		testInstance.push(5);

		testInstance.toDisplay();
	}
}