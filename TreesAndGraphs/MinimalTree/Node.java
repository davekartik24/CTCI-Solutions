

public class Node {

	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}

	public boolean equals(Object input) {

		if(input instanceof Node) {

			Node inputCast = (Node) input;
			return (this.value == inputCast.value);
		}

		return false;
	}

	public int hashCode() {

		return 31 * value;
	}
}