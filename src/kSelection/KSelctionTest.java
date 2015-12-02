package kSelection;
import Timer.*;
import outputForAnalysis.Outputs;

import java.io.File;

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
		
		File log = new File("kSelectionLog.txt");
		Outputs.OutputToFile(log,timer.getElapsedTime(q, p));
		
		System.out.println(timer.getElapsedTime(q,p));
        System.out.println(k + "th largest is "+ find);
	}

}
