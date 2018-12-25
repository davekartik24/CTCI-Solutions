

import java.util.*;
import java.io.*;

public class IsRoutePresent {

	public HashMap<Integer, ArrayList<Integer>> toGraphFromFile(String filePath) {

		HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

		try {

			File inputFile = new File(filePath);

			FileReader fr = new FileReader(inputFile);

			BufferedReader br = new BufferedReader(fr);

			String fileData = null;

			while((fileData = br.readLine()) != null) {

				String[] keyValue = fileData.split(":");

				String[] value = keyValue[1].split(",");

				ArrayList<Integer> keys = new ArrayList<>();

				for(String v : value) {

					keys.add(Integer.parseInt(v));
				}

				graph.put(Integer.parseInt(keyValue[0]), keys);

			} 

		} catch(Exception ex) {

				System.out.println(ex.getMessage());
		}

		return graph;
	}

	public boolean isRoutePresent(HashMap<Integer, ArrayList<Integer>> graph, Integer start, Integer end) {

		ArrayDeque<Integer> queue = new ArrayDeque<>();

		HashSet<Integer> visitedNode = new HashSet<>();

		queue.addLast(start);

		while(!queue.isEmpty()) {

			Integer focusedNode = queue.removeFirst();
			visitedNode.add(focusedNode);

			if(graph.containsKey(focusedNode)) {

				for(Integer element : graph.get(focusedNode)) {

					if(!visitedNode.contains(element)) {
						if(element == end) return true;
						queue.addLast(element);
					}
				}
			}
		}

		return false; 

	}

	public static void main(String[] args) {

		IsRoutePresent testInstance = new IsRoutePresent();

		HashMap<Integer, ArrayList<Integer>> graph = testInstance.toGraphFromFile("C:/Users/Kartik/Documents/Summer2019/Git/CTCI-Solutions/TreesAndGraphs/RouteBetweenNodes/InputGraph.txt");

		System.out.println("The route is present -> " + testInstance.isRoutePresent(graph, 5, 0));

	}
}