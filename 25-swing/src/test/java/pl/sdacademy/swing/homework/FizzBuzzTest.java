package pl.sdacademy.swing.homework;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sdacademy.swing.fizzbuzz.FizzBuzz;



class FizzBuzzTest {
	@Test
	void fizzBuzz(){
		//given
		int number = 0;

		//when
		String msg = FizzBuzz.msg(number);

		//then
		Assertions.assertThat(FizzBuzz.msg(0)).isEqualTo("FizzBuzz");
		Assertions.assertThat(FizzBuzz.msg(1)).isEqualTo("1");
		Assertions.assertThat(FizzBuzz.msg(2)).isEqualTo("2");
		Assertions.assertThat(FizzBuzz.msg(3)).isEqualTo("Fizz");
		Assertions.assertThat(FizzBuzz.msg(4)).isEqualTo("4");
		Assertions.assertThat(FizzBuzz.msg(5)).isEqualTo("Buzz");
		Assertions.assertThat(FizzBuzz.msg(6)).isEqualTo("Fizz");
		Assertions.assertThat(FizzBuzz.msg(7)).isEqualTo("7");
		Assertions.assertThat(FizzBuzz.msg(8)).isEqualTo("8");
		Assertions.assertThat(FizzBuzz.msg(9)).isEqualTo("Fizz");
		Assertions.assertThat(FizzBuzz.msg(10)).isEqualTo("Buzz");
		Assertions.assertThat(FizzBuzz.msg(11)).isEqualTo("11");
		Assertions.assertThat(FizzBuzz.msg(12)).isEqualTo("Fizz");
		Assertions.assertThat(FizzBuzz.msg(13)).isEqualTo("13");
		Assertions.assertThat(FizzBuzz.msg(14)).isEqualTo("14");
		Assertions.assertThat(FizzBuzz.msg(15)).isEqualTo("FizzBuzz");
	}
}
