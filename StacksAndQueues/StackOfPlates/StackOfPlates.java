import java.util.*;

public class StackOfPlates {

	List<ArrayDeque<Integer>> stackSet;

	int threshold;
	int topIndex;

	public StackOfPlates(int threshold) {

		stackSet = new ArrayList<>();
		this.threshold = threshold;
		topIndex = -1;
	}


	public void push(int input) {

		int stackLocation = (topIndex + 1) / threshold;
		int lengthStackSet = stackSet.size();

		if(lengthStackSet < stackLocation + 1) {

			ArrayDeque<Integer> stack = new ArrayDeque<>();
			stackSet.add(stackLocation, stack); 
		} 

		stackSet.get(stackLocation).push(input);

		topIndex++;

	}

	public void convertString() {

		int lengthStackSet = stackSet.size();

		for(int i = lengthStackSet - 1;  i >= 0; i--) {

			int stackLength = stackSet.get(i).size();

			for(int j = 0; j < stackLength; j++) {

				System.out.println("The set of stack is " + i + " with value as " + stackSet.get(i).pop());
			}
		} 
	}
 

	public int pop() {

		int stackLocation = (topIndex + 1) / threshold;

		return stackSet.get(stackLocation).pop();
	}

	public static void main(String[] args) {

		StackOfPlates testInstance = new StackOfPlates(5);

		for(int i = 1; i < 7; i++) {
			testInstance.push(i);
		}

		testInstance.convertString();


	}
}