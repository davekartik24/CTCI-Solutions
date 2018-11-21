


public class ReturnKthToLastUsingTwoPointers {


	public class Node {

		Node next;

		int value;

		public Node(int value) {

			this.value = value;
		}

	}

	public Node retrunKth(int k, Node head) {

		if(head == null) return null;
  
		Node FirstNode = head;

		Node secondNode = head;

		for(int i = 1; i < k; i++) {

			if(FirstNode == null) {

				return null;
			}

			FirstNode = FirstNode.next;
		}

		while(FirstNode.next != null) {

			secondNode = secondNode.next;
			FirstNode = FirstNode.next;
		}

		return secondNode; 

	}

	public static void main(String[] args) {

		ReturnKthToLastUsingTwoPointers testInstance = new ReturnKthToLastUsingTwoPointers();

		Node FirstNode = new ReturnKthToLastUsingTwoPointers(). new Node(1);
		Node SecondNode = new ReturnKthToLastUsingTwoPointers().new Node(2);
		Node ThirdNode = new ReturnKthToLastUsingTwoPointers().new Node(3);
		Node FourthNode = new ReturnKthToLastUsingTwoPointers().new Node(4);
		Node FifthNode = new ReturnKthToLastUsingTwoPointers().new Node(5);

		FirstNode.next = SecondNode;
		SecondNode.next = ThirdNode;
		ThirdNode.next = FourthNode;
		FourthNode.next = FifthNode;

		System.out.println(testInstance.retrunKth(2, FirstNode).value);

	}

}