package pl.sdacademy.swing.fizzbuzz;

public class FizzBuzz {
	public static String msg(int number){
	String odp;

		if (number % 15 == 0) odp = "FizzBuzz";
		else if (number % 5 == 0) odp = "Buzz";
		else if (number % 3 == 0) odp = "Fizz";
		else odp = Integer.toString(number);

		return odp;
	}
}
