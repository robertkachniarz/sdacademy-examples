package pl.sdacademy.tdd;

public class FizzBuzzWhiz {
	public static String fizzBuzzWhiz (int number){
		String s="";
		if (number == 1) s = "1";
		else if (number == 2) s = "Whiz";
		else if (number % 3 == 0) s = "FizzWhiz";
		else if (number % 2 == 0) s = Integer.toString(number);
		return s;
	}
}
