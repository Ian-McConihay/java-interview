import java.util.List;

public class OddNumbersList {
	public static void main(String[] args) {

	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}
	public static boolean onlyOddNumbersPS(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

}
