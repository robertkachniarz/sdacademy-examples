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

	public static int[] quickSort(int[] arr, int low, int high){
		if (low < high)
		{
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		return arr;
	}

	public static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high - 1; j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
