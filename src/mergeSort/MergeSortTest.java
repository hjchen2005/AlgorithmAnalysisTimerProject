package mergeSort;

import Sorting.MergeSort;
import Timer.ArrayDistinctElements;
import Timer.ArrayTimer;

public class MergeSortTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDistinctElements.list();
		int k=9957;
		int find = 0;
		//ArrayDistinctElements.print();
		ArrayTimer timer = new ArrayTimer();
		MergeSort mergesort = new MergeSort();
		long p=timer.start();
		
		for (int j=0; j<100; j++){
			mergesort.sort(ArrayDistinctElements.arrayRandom);
		}
		long q=timer.stop();
		
		System.out.println(timer.getElapsedTime(q,p));
        System.out.println(k + "th largest is "+ find);
	}

}
