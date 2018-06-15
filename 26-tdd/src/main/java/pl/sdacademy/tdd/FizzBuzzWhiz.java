package pl.sdacademy.tdd;

public class FizzBuzzWhiz {
	public static String fizzBuzzWhiz (int number){
		String s="";
		if (number == 1) s = "1";
		else if (number == 2) s = "Whiz";
		else if (number % 3 == 0) s = "FizzWhiz";
		return s;
	}
}
