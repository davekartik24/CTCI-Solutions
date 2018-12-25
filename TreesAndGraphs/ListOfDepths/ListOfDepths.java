

import java.util.*;
import java.io.*;

public class ListOfDepths {

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

	public void getDepthList(HashMap<Integer, ArrayList<Integer>> graph, Integer source) {

		ArrayDeque<Integer> queue = new ArrayDeque<>();

		HashSet<Integer> visitedSet = new HashSet<>();

		queue.addLast(source);
		queue.addLast(-1);

		LinkedList<Integer> addList = new LinkedList<>();

		while(!queue.isEmpty()) {

			Integer poppedNode = queue.removeFirst();

			if(poppedNode == -1) {

				for(Integer e : addList) {

					System.out.print(e + " ");
				}

				System.out.println();

				addList.clear();

				queue.addLast(-1);
			} else {

				visitedSet.add(poppedNode);

				addList.add(poppedNode);

				if(graph.containsKey(poppedNode)) {

					for(Integer element : graph.get(poppedNode)) {

						if(!visitedSet.contains(element)) {

							queue.add(element);
						}
					}
				}

			}
		} 
	}

	public static void main(String[] args) {

		ListOfDepths testInstance = new ListOfDepths();

		HashMap<Integer, ArrayList<Integer>> graph = testInstance.toGraphFromFile("C:/Users/Kartik/Documents/Summer2019/Git/CTCI-Solutions/TreesAndGraphs/ListOfDepths/InputGraph.txt");

		testInstance.getDepthList(graph, 5);

	}
}