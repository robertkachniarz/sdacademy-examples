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
}
