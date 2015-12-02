package Timer;

import java.util.Random;

public class ArrayDistinctElements {

    public static int[] arrayRandom;
    public static int arraySize = 1000000;

    public static int[] list(){
        arrayRandom = new int[arraySize];   
        for(int i=0; i<arrayRandom.length; i++) {
            arrayRandom[i] = randomFill();
        }
        return arrayRandom;
    }

    public static void print(){
        for(int n: arrayRandom){
        	System.out.println(n+" ");
        }
    }


    public static int randomFill(){

    	Random rand = new Random();
    	int randomNum = rand.nextInt();
    	return randomNum;
    }
}
