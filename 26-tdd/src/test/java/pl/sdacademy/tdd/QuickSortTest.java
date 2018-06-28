package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

	@DisplayName("Should return null when given is array arr")
	@Test
	void quickSortTest1(){
		//given
		int[] arr = {};
		int high = arr.length;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isEmpty();
	}

	@DisplayName("Should return not null array when given is array with one element")
	@Test
	void quickSortTest2(){
		//given
		int[] arr = {0};
		int high = arr.length - 1;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isNotEmpty();
	}

	@DisplayName("Should return sorted array when given is sorted array with two numbers")
	@Test
	void quickSortTest3(){
		//given
		int[] arr = {0, 1};
		int high = arr.length - 1;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isSorted();
	}

	@DisplayName("Should return sorted array when given is unsorted array with two numbers")
	@Test
	void quickSortTest4(){
		//given
		int[] arr = {1, 0};
		int high = arr.length - 1;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isSorted();
	}

	@DisplayName("Should return sorted array when given is unsorted array with three numbers")
	@Test
	void quickSortTest5(){
		//given
		int[] arr = {2, 1, 0};
		int high = arr.length - 1;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isSorted();
	}

	@DisplayName("Should return sorted array when given is unsorted array with many numbers")
	@Test
	void quickSortTest6(){
		//given
		int[] arr = {2, 1, 0, 5, 9, 6, 7, 2, 1, 3};
		int high = arr.length - 1;
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr, 0, high);
		//then
		assertThat(resultArray).isSorted();
	}
}
