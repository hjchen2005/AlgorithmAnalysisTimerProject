package quickSort;

import Sorting.*;
import Timer.ArrayDistinctElements;
import Timer.ArrayTimer;

public class QuickSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDistinctElements.list();
		int k=9957;
		int find = 0;
		//ArrayDistinctElements.print();
		ArrayTimer timer = new ArrayTimer();
		QuickSort quicksort = new QuickSort();
		long p=timer.start();
		
		for (int j=0; j<100; j++){
			quicksort.sort(ArrayDistinctElements.arrayRandom);
		}
		long q=timer.stop();
		
		System.out.println(timer.getElapsedTime(q,p));
        System.out.println(k + "th largest is "+ find);
	}

}
