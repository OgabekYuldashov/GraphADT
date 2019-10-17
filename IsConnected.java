package lab11;

public class IsConnected extends BreadthFirstSearch {
	private int compCount = 0;

	public IsConnected(Graph graph) {
		super(graph);
	}

	//TO-DO
	public boolean isConnected() {
		return false;
	}

	public int getConnectedComponentsCount(){
		start();
		return compCount;
	}

	@Override
	protected void additionalProcessing() {
		//increase the counter when the end of component loop is reached
		compCount++;
	}
}
