
import java.util.*;

public class QueueViaStacks {

	ArrayDeque<Integer> stackOne;
	ArrayDeque<Integer> stackTwo;

	boolean popFlag = false;

	public QueueViaStacks() {

		stackOne = new ArrayDeque<>();
		stackTwo = new ArrayDeque<>();
	}

	public void queue(int input) {

		if(popFlag) {

			popFlag = false;

			while(!stackTwo.isEmpty()) {

				stackOne.push(stackTwo.poll());
			}
		}
		stackOne.push(input);
	}

	public int deque() {

		if(popFlag) {
			return stackTwo.poll();
		} else {
			popFlag = true;

			while(!stackOne.isEmpty()) {
				stackTwo.push(stackOne.poll());
			}
		}

		return stackTwo.poll();
	}

	public static void main(String[] args) {

		QueueViaStacks testInstance = new QueueViaStacks();

		testInstance.queue(1);
		testInstance.queue(2);
		testInstance.queue(3);
		testInstance.queue(4);
		testInstance.queue(5);

		System.out.println(testInstance.deque());
		System.out.println(testInstance.deque());
		System.out.println(testInstance.deque());
	}
}