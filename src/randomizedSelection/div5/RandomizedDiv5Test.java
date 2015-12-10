package randomizedSelection.div5;

import java.io.File;

import Timer.ArrayDistinctElements;
import Timer.ArrayTimer;
import algorithms.randomizedSelections.Div5;
import outputForAnalysis.ChartVisual;
import outputForAnalysis.Outputs;

public class RandomizedDiv5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Div5 div5 = new Div5();
			int[] inputArray = new int[ArrayDistinctElements.arraySize];
			div5.populateArray(inputArray,ArrayDistinctElements.arraySize);
			ArrayTimer timer = new ArrayTimer();
			long p=timer.start();
			
			for (int j=0; j<100; j++){
				//find = RandomizedSelection.randomizedSelect(ArrayDistinctElements.arrayRandom,0,ArrayDistinctElements.arraySize-1,k);
				div5.arrayDivider(inputArray);
			}
			long q=timer.stop();
			System.out.println(timer.getElapsedTime(q,p));
			File log = new File("RandomizedDiv5.txt");
			Outputs.OutputToFile(log,timer.getElapsedTime(q, p));
			ChartVisual.chartCreation(log, "Randomized Selection - Div 3");
	}

}
