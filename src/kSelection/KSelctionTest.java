package kSelection;
import Timer.*;
import Sorting.*;

public class KSelctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDistinctElements.list();
		int k=9957;
		int find = 0;
		//ArrayDistinctElements.print();
		ArrayTimer timer = new ArrayTimer();
		KSelection kselection = new KSelection();
		long p=timer.start();
		
		for (int j=0; j<100; j++){
			find = kselection.selectKth(ArrayDistinctElements.arrayRandom, ArrayDistinctElements.arraySize-k);
		}
		long q=timer.stop();
		
		System.out.println(timer.getElapsedTime(q,p));
        System.out.println(k + "th largest is "+ find);
	}

}
