import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
	public static void main(String[] arguments) {
		// creating HashMap.
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		// inserting sets.
		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");
		// iterating using for loop.
		for (Map.Entry<Integer, String> set : hash_map.entrySet()) {
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}
