public class StringContainsVowel {
	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello"));
		System.out.println(stringContainsVowels("TV"));
	}
	public static boolean stringContainsVowels(String input){
		return input.toLowerCase().matches(".*[aeiou].*");
//		.* matches any char zero or more times
//		[aeiou] is what matches is checking for
//		$ matches the end or beginning of string
	}
}
