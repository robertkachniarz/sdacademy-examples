import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.sdacademy.tdd.SortingAlgorithms;

import static org.assertj.core.api.Assertions.*;

public class SortingAlgorithmsTest {

	@DisplayName("Should return array with one number when given is array with this one number")
	@Test
	void bubbleSortTest1(){
		//given
		int[] arr = {7};
		//when
		int[] resultArray = SortingAlgorithms.bubbleSort(arr);
		//then
		assertThat(arr).containsExactly(resultArray);
	}

	@DisplayName("Should return sorted array with two numbers when given is unsorted array with two numbers")
	@Test
	void bubbleSortTest2(){
		//given
		int[] arr = {7, 5};
		//when
		int[] resultArray = SortingAlgorithms.bubbleSort(arr);
		//then
		assertThat(resultArray).isSorted();
	}
}
