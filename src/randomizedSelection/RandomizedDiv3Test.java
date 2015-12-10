package randomizedSelection;

import Timer.ArrayDistinctElements;
import Timer.ArrayTimer;
import algorithms.randomizedSelections.*;
import outputForAnalysis.ChartVisual;
import outputForAnalysis.Outputs;

import java.io.File;

public class RandomizedDiv3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayDistinctElements.list();
		//int find = 0;
		
		// Set up the Div3
		Div3 div3 = new Div3();
		int[] inputArray = new int[ArrayDistinctElements.arraySize];
		div3.populateArray(inputArray,ArrayDistinctElements.arraySize);
		ArrayTimer timer = new ArrayTimer();
		
		long p=timer.start();
		
		for (int j=0; j<100; j++){
			//find = RandomizedSelection.randomizedSelect(ArrayDistinctElements.arrayRandom,0,ArrayDistinctElements.arraySize-1,k);
			div3.arrayDivider(inputArray);
			//pivot = Div3.pivotSelector(inputArray);
			//Div3.RandomizedSelector(inputArray, pivot);
		}
		long q=timer.stop();
		
		System.out.println(timer.getElapsedTime(q,p));
		File log = new File("RandomizedDiv3.txt");
		Outputs.OutputToFile(log,timer.getElapsedTime(q, p));
		ChartVisual.chartCreation(log, "Randomized Selection - Div 3");
        //System.out.println(k + "th largest is "+ find);
	}

}
