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
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr);
		//then
		assertThat(resultArray).isNull();
	}

	@DisplayName("Should return not null array when given is array with one element")
	@Test
	void quickSortTest2(){
		//given
		int[] arr = {0};
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr);
		//then
		assertThat(resultArray).isNotEmpty();
	}

	@DisplayName("Should return sorted array when given is sorted array with two numbers")
	@Test
	void quickSortTest3(){
		//given
		int[] arr = {0, 1};
		//when
		int[] resultArray = SortingAlgorithms.quickSort(arr);
		//then
		assertThat(resultArray).isSorted();
	}
}
