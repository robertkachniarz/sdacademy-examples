package pl.sdacademy.tdd;

public class SortingAlgorithms {
	public static int[] bubbleSort(int[] arr){
		int n = arr.length;
		for (int i = 0; i < n - 1 ; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}

}
