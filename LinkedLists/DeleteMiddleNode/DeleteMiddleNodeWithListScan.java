

public class DeleteMiddleNodeWithListScan{

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

	public void deleteFocusedNode(Node head, Node focusedNode) {

		Node currentNode = head; 

		Node previousNode = null;

		while(currentNode != null) {

			if(currentNode.equals(focusedNode)) {
				if(previousNode == null || currentNode.next == null) return;

				previousNode.next = currentNode.next;
				return;
			} else {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
	} 


	public static void main(String[] args) {

		DeleteMiddleNodeWithListScan testInstance = new DeleteMiddleNodeWithListScan();

		Node FirstNode = new DeleteMiddleNodeWithListScan(). new Node(1);
		Node SecondNode = new DeleteMiddleNodeWithListScan().new Node(2);
		Node ThirdNode = new DeleteMiddleNodeWithListScan().new Node(3);
		Node FourthNode = new DeleteMiddleNodeWithListScan().new Node(4);
		Node FifthNode = new DeleteMiddleNodeWithListScan().new Node(5);

		FirstNode.next = SecondNode;
		SecondNode.next = ThirdNode;
		ThirdNode.next = FourthNode;
		FourthNode.next = FifthNode;

		testInstance.deleteFocusedNode(FirstNode, FifthNode);

		while(FirstNode != null) {

			System.out.println(FirstNode.value);
			FirstNode = FirstNode.next;
		}


	}
}