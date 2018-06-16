package pl.sdacademy.tdd;

public class FizzBuzzWhiz {
	public static String fizzBuzzWhiz (int number){
		String s="";
		if (number == 1) s = "1";
		else if (number % 3 == 0 && FizzBuzzWhiz.isPrime(number)) s = "FizzWhiz";
		else if (number % 5 == 0 && FizzBuzzWhiz.isPrime(number)) s = "BuzzWhiz";
		else if (!FizzBuzzWhiz.isPrime(number)) {
			if (number % 15 == 0){
				s = "FizzBuzz";
			}
			else if (number % 3 == 0) {
				s = "Fizz";
			}
			else if (number % 5 == 0) {
				s = "Buzz";
			}
			else s = Integer.toString(number);
			}
		else if (FizzBuzzWhiz.isPrime(number)) s = "Whiz";

		return s;
	}
	public static boolean isPrime (int number){
		boolean isNumberPrime = true;
		for (int i = 2; i < number; i++){
			if (number % i == 0){
				isNumberPrime = false;
			}

		}
		return isNumberPrime;
	}
}
