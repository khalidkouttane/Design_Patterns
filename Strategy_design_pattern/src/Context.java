
public class Context {
	private SortStrategy strategy = null;
	
	public Context(SortStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void arrange(int[] array) {
		strategy.sort(array);
	}
}
