package algorithms.randomizedSelections;

public interface RandomizedSelectTemplate {
	public void kUpdater(int[] A);
	public void populateArray( int [] A, int range);
	public int pivotSelector(int [] a);
	public void arrayDivider(int [] a);
	public void RandomizedSelector (int [] a, int p);
	public void sort(int arraySize, int randomSize);
	public void printArray(int[] A);
}
