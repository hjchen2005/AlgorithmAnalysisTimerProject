package tests.randomized.div3;
import Timer.ArrayTimer;
import algorithms.randomizedSelections.*;

public class Div3SmallInputTest {
	public static void main (String args[]){
		Div3 algo = new Div3();
		int k = 10;
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
		
		int loopTimes = 10;
		ArrayTimer timer = new ArrayTimer();
		long p=timer.start();
		
		//algo.populateArray(smallSampleArray, smallSampleArray.length);
		algo.printArray(smallSampleArray);
		for(int i =0; i<loopTimes;i++){
			algo.sort(smallSampleArray.length,smallSampleArray.length);
			//algo.arrayDivider(smallSampleArray);
		}
		
		long q = timer.stop();
		System.out.println(timer.getElapsedTime(q,p));
		algo.printArray(smallSampleArray);
	}
}
