


public class DeleteMiddleNodeWithNoHeadGiven{

	public class Node {

		Node next;

		int value;

		public Node(int value) {

			this.value = value;
		}

		public boolean equals(Object fNode) {

			if(fNode instanceof Node) {

				Node toConsider = (Node)fNode;

				return toConsider.value == this.value;
			}

			return false;
		}

		public int hashCode() {

			return value;
		}

	}

	public void deleteMidNode(Node focusedNode) {

		if(focusedNode == null || focusedNode.next == null) {
			
			return;
		} 

		focusedNode.value = focusedNode.next.value;
		focusedNode.next = focusedNode.next.next;
	}

	public static void main(String[] args) {

		DeleteMiddleNodeWithNoHeadGiven testInstance = new DeleteMiddleNodeWithNoHeadGiven();

		Node FirstNode = new DeleteMiddleNodeWithNoHeadGiven(). new Node(1);
		Node SecondNode = new DeleteMiddleNodeWithNoHeadGiven().new Node(2);
		Node ThirdNode = new DeleteMiddleNodeWithNoHeadGiven().new Node(3);
		Node FourthNode = new DeleteMiddleNodeWithNoHeadGiven().new Node(4);
		Node FifthNode = new DeleteMiddleNodeWithNoHeadGiven().new Node(5);

		FirstNode.next = SecondNode;
		SecondNode.next = ThirdNode;
		ThirdNode.next = FourthNode;
		FourthNode.next = FifthNode;

		testInstance.deleteMidNode(FourthNode);

		while(FirstNode != null) {

			System.out.println(FirstNode.value);
			FirstNode = FirstNode.next;
		}


	}
}