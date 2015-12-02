package Sorting;

import java.util.Random;
//import java.util.Scanner;

public class RandomizedSelection {
	

    public static int randomizedSelect(int[] array, int p, int r, int i) {
        if (p == r)
            return array[p];

        if (i == 0)
            return -1;

            int mid = randomizedPartition(array, p, r);
            int k1 = mid - p + 1;

            if (k1 == i) 
                return array[mid];
            else if (i < k1)
                return randomizedSelect(array, p, mid-1, i);
            else
                return randomizedSelect(array, mid+1, r, i-k1);

    }

    public static int randomizedPartition(int[] array, int start, int end) {
        Random rand = new Random(1);
        int pivotIdx = rand.nextInt((end - start) + 1) + start;
        int pivot = array[pivotIdx];

        swap(array, pivotIdx, end);
        pivotIdx = end;

        int i = start - 1;

        for (int j = start; j <= end-1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array,i, j);
            }
        }
        swap(array, i+1, pivotIdx);
        return i+1;
    }

    private static void swap(int[] array, int indexI, int indexJ) {
        int temp = indexI;
        indexI = indexJ;
        indexJ = temp;
    }       

}