import org.junit.jupiter.api.Test;
import pl.sdacademy.tdd.FizzBuzzWhiz;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzWhizTest {

	/*
	Same as FizzBuzz but substitute prime numbers with "Whiz"
	Write some code that will generate a string of integers, starting at 1 and going up to 100, all separated
	by commas. Substitute any integer which is divisible by 3 with "Fizz", and any integer which is divisible
	by 5 with "Buzz", and any integer divisible by 3 and 5 with "FizzBuzz".
	*/

	@Test
	//@DisplayName("jakiś opis")
	void fizBuzzAndPrime1() {
		//given
		int n = 1;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("1");
	}

	@Test
	void fizBuzzAndPrime2() {
		//given
		int n = 2;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Whiz");
	}

	@Test
	void fizBuzzAndPrime3() {
		//given
		int n = 3;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("FizzWhiz");
	}

	@Test
	void fizBuzzAndPrime4() {
		//given
		int n = 4;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("4");
	}

	@Test
	void fizBuzzAndPrime5() {
		//given
		int n = 5;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("BuzzWhiz");
	}
	@Test
	void fizBuzzAndPrime6() {
		//given
		int n = 6;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Fizz");
	}
	@Test
	void fizBuzzAndPrime7() {
		//given
		int n = 7;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Whiz");
	}
	@Test
	void fizBuzzAndPrime8() {
		//given
		int n = 8;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("8");
	}
	@Test
	void fizBuzzAndPrime15() {
		//given
		int n = 15;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("FizzBuzz");
	}
	@Test
	void fizBuzzAndPrime47() {
		//given
		int n = 47;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Whiz");
	}
	@Test
	void fizBuzzAndPrime51() {
		//given
		int n = 51;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Fizz");
	}
	@Test
	void fizBuzzAndPrime65() {
		//given
		int n = 65;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("Buzz");
	}
	@Test
	void fizBuzzAndPrime75() {
		//given
		int n = 75;
		//when
		String msg = FizzBuzzWhiz.fizzBuzzWhiz(n);
		//then
		assertThat(msg).isEqualTo("FizzBuzz");
	}

}

