package lab11;

import java.util.ArrayList;


public class HasCycle extends BreadthFirstSearch {
	
	public HasCycle(Graph graph) {
		super(graph);
	}
	
	//TO-DO
	public boolean hasCycle() {
		int noOfedges = graph.edges.size();

		FindSpanningTree findSpanningTree = new FindSpanningTree(graph);
		Graph spanningTree = findSpanningTree.computeSpanningTree();
		int spanningTreeEdges = spanningTree.edges.size();

		if (noOfedges > spanningTreeEdges)
			return true;
		else
			return false;
	}

}
