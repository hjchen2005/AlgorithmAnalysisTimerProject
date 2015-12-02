package Timer;

public class ArrayTimer {
	 private double startTime;

	 private double endTime;

	 public long start() {
		 startTime = System.currentTimeMillis();
		 return (long) startTime;
     }

	 public long stop() {
	     endTime = System.currentTimeMillis();
	     return (long) endTime;
	 }

	 public double getElapsedTime(long endTime, long startTime) {
	     return endTime - startTime;
	 }
	   
}
