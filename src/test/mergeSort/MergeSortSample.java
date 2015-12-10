// This is proven to be working
package tests.mergeSort;

import java.util.ArrayList;

import Timer.ArrayTimer;
import algorithms.MergeSort;
import outputForAnalysis.ChartVisual;

public class MergeSortSample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] smallSampleArray = {10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
				10,20,30,40,50,60,71,80,90,91,
		};
		int k=11;
		int loopTimes = 10;
		//ArrayDistinctElements.print();
		ArrayTimer timer = new ArrayTimer();
		MergeSort mergesort = new MergeSort();
		//ArrayList<Integer> count = new ArrayList<>();
		//JDBCCategoryDataset dataSet = new JDBCCategoryDataset();
		long p=timer.start();
		for(int i =0; i<loopTimes;i++){
			mergesort.sort(smallSampleArray);
			//count.add(mergesort.compareCount);
			//ChartVisual.liveComparisonRecord(mergesort.compareCount,i,count);
		}
		long q=timer.stop();
		
		int find = smallSampleArray[smallSampleArray.length-k];
		
		System.out.println(mergesort.compareCount+"\n");
		
		System.out.println(timer.getElapsedTime(q,p));
        System.out.println(k + "th largest is "+ find);
        //ChartVisual.liveChart(loopTimes,dataSet,count, "Merge Sort");
		
	}

}

