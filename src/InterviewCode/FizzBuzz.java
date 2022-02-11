package InterviewCode;

public class FizzBuzz {
	public static int fizzbuzz(int num){
		for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else  System.out.println(i);
        }
		return num;
	}

	public static void main(String[] args) {
		System.out.println("You incremented fizzbuzz " + fizzbuzz(15) + " times.");
	}
}
