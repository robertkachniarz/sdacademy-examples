package pl.sdacademy.tdd;

public class SortingAlgorithms {
	public static int[] bubbleSort(int[] arr){
		if (arr[0] > arr[1]){
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		return arr;
	}

}
