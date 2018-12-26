

import java.util.*;

public class MinimalTree {

	public Node formTree(int start, int end, int[] inputSortedArray) {

		if(start > end) return null;

		if(start == end) return new Node(inputSortedArray[start]);

		int mid = (end + start) / 2;

		Node midNode = new Node(inputSortedArray[mid]);

		Node left = formTree(start, mid - 1, inputSortedArray);
		Node right = formTree(mid + 1, end, inputSortedArray);

		midNode.left = left;
		midNode.right = right;

		return midNode;

	}

	public static void main(String[] args) {

		int[] inputSortedArray = {1,2,3,4,5,6,7};

		MinimalTree testInstance = new MinimalTree();

		Node root = testInstance.formTree(0, 6, inputSortedArray);

		System.out.println(root.value);
		System.out.println(root.left.value + "  :  " + root.right.value);
		System.out.println(root.left.left.value + "  :  " + root.left.right.value);
		System.out.println(root.right.left.value + "  :  " + root.right.right.value);
	}
}