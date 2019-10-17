package lab11;



public class PathExists extends BreadthFirstSearch {
	Vertex v;
	boolean pathExists = false;

	public PathExists(Graph graph) {
		super(graph);
	}

	//TO-DO
	public boolean pathExists(Vertex u, Vertex v) {
		this.v = v;
		start(u);

		return false;
	}

	@Override
	protected void additionalProcessing() {
		if (hasBeenVisited(v)){
			pathExists = true;
		}
	}
}
