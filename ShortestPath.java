package lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ShortestPath extends BreadthFirstSearch {
	private HashMap<Vertex, Integer> levelsMap = new HashMap<Vertex, Integer>();
	private HashMap<Vertex, Vertex> parentMap = new HashMap<Vertex, Vertex>();

	/** Assumes g is connected */
	public ShortestPath(Graph g) {
		super(g);

	}

	@Override
	protected void processEdge(Edge e) {
		if(levelsMap.size() == 0) {
			levelsMap.put(e.v, 0);
			parentMap.put(e.v, null);
		}
		parentMap.put(e.u , e.v);
		levelsMap.put(e.u, levelsMap.get(parentMap.get(e.u)) + 1);
	}

	//TO-DO
	public int computeShortestPathLength(Vertex s, Vertex v) {
		start(s);
		return levelsMap.get(v);
	}

	
}
