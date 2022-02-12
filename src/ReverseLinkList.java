import java.util.LinkedList;

public class ReverseLinkList {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println(linkedList);

		LinkedList<Integer> ll1 = new LinkedList<>();

		linkedList.descendingIterator().forEachRemaining(ll1::add);

		System.out.println(ll1);
	}
}
