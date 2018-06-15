import org.junit.jupiter.api.Test;
import pl.sdacademy.tdd.Fibonacci;

import static org.assertj.core.api.Assertions.*;

class FibonacciTest {


	@Test
	void nothing(){

		//given
		int n =0;

		//when
		int number = Fibonacci.fibonacciNumberOfString(n);

		//then
		assertThat(Fibonacci.fibonacciNumberOfString(0)).isEqualTo(0);
		Fibonacci.fibonacciString(0);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(1)).isEqualTo(1);
		Fibonacci.fibonacciString(1);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(2)).isEqualTo(1);
		Fibonacci.fibonacciString(2);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(3)).isEqualTo(2);
		Fibonacci.fibonacciString(3);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(4)).isEqualTo(3);
		Fibonacci.fibonacciString(4);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(5)).isEqualTo(5);
		Fibonacci.fibonacciString(5);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(6)).isEqualTo(8);
		Fibonacci.fibonacciString(6);
		System.out.println("#######################################################");

		assertThat(Fibonacci.fibonacciNumberOfString(7)).isEqualTo(13);
		Fibonacci.fibonacciString(7);
		System.out.println("#######################################################");
		//fail ("bla");


	}
}
