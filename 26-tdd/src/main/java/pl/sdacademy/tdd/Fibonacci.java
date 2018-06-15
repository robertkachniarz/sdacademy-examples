package pl.sdacademy.tdd;

public class Fibonacci {
	public static int fibonacciNumberOfString (int index){
		int fibonacciResult;
		if (index == 0){
			fibonacciResult = 0;
		}
		else if (index == 1) {
			fibonacciResult = 1;
		}

		else {
			fibonacciResult = fibonacciNumberOfString(index -1) + fibonacciNumberOfString(index -2);
			}

		return fibonacciResult;

	}

	public static void fibonacciString (int index){
		for (int i = 0; i <= index; i++){
			System.out.println("F" + i + "=>" + fibonacciNumberOfString(i));
		}
	}
}
