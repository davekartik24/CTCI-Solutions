
import java.util.*;

public class BuildOrder {

	ArrayDeque<Character> orderOfBuildList;

	public BuildOrder() {

		orderOfBuildList = new ArrayDeque<>();
	}


	public void topologicalSort(char[] vertices, HashMap<Character, ArrayList<Character>> inputDependencies) {

		HashSet<Character> visitedNodes = new HashSet<>();

		for(char v : vertices) {

			if(!visitedNodes.contains(v)) {

				dfs(v, inputDependencies, visitedNodes);
			}
		}
	} 

	public void dfs(char node, HashMap<Character, ArrayList<Character>> inputDependencies, HashSet<Character> visitedNodes) {

		if(node == '\u0000') return;

		visitedNodes.add(node);

		if(inputDependencies.containsKey(node)) {

			for(Character element : inputDependencies.get(node)) {

				if(!visitedNodes.contains(element)) {

					dfs(element, inputDependencies, visitedNodes);
				}				
			}
		}

		orderOfBuildList.addFirst(node);
	}

	public static void main(String[] args) {

		BuildOrder testInstance = new BuildOrder();

		char[] vertices = {'a', 'b', 'c', 'd', 'e', 'f'};

		HashMap<Character, ArrayList<Character>> inputDependencies = new HashMap<>();

		ArrayList<Character> insertOne = new ArrayList<>();
		insertOne.add('d');
		inputDependencies.put('a', insertOne);

		ArrayList<Character> insertTwo = new ArrayList<>();
		insertTwo.add('b');
		insertTwo.add('a');
		inputDependencies.put('f', insertTwo);		

		ArrayList<Character> insertThree = new ArrayList<>();
		insertThree.add('d');
		inputDependencies.put('b', insertThree);

		ArrayList<Character> insertFour = new ArrayList<>();
		insertFour.add('c');
		inputDependencies.put('d', insertFour);

		testInstance.topologicalSort(vertices, inputDependencies);

		System.out.println(testInstance.orderOfBuildList);

	}
}