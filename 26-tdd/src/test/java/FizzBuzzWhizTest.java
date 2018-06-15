import org.junit.jupiter.api.Test;
import pl.sdacademy.tdd.FizzBuzzWhiz;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzWhizTest {
	// @DisplayName("jakiś opis");
	/*
	Same as FizzBuzz but substitute prime numbers with "Whiz"
	Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated
	by commas. Substitute any integer which is divisible by 3 with "Fizz", and any integer which is divisible
	by 5 with "Buzz", and any integer divisible by 3 and 5 with "FizzBuzz".
	*/

	@Test
	void fizBuzzAndPrime() {

		//given
		int n = 0;

		//when
		int number = 0;

		//then
		assertThat(FizzBuzzWhiz.fizzBuzzWhiz(1)).isEqualTo("1");
		assertThat(FizzBuzzWhiz.fizzBuzzWhiz(2)).isEqualTo("Whiz");
		assertThat(FizzBuzzWhiz.fizzBuzzWhiz(3)).isEqualTo("FizzWhiz");
		assertThat(FizzBuzzWhiz.fizzBuzzWhiz(4)).isEqualTo("4");



	}
}

