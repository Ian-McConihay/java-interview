package InterviewCode;

public class Fibonacci {

	static int fibonacci(int num) {
		int fibonacci[] = new int[num + 2];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i = 2; i <= num; i++){
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci[num];
	}

	private static long fibonacciTwo(int num){
//		base case
		if(num <= 1){
			return num;
		}
		return (fibonacciTwo(num - 1) + fibonacciTwo(num - 2));
	}

//	So the fibonacci is the sum of the last two numbers in sequence... 0,1,1,2,3,5,8,13,21,34,55
//	The method takes in an int that will return the index of the sequence.
//	if you start to get negative numbers its because longs or ints cant go past a certain num
	public static void main(String[] args) {
	int n = 3;
		System.out.println(fibonacci(n));
		System.out.println(fibonacciTwo(n));
	}
}
