package InterviewCode;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDepth {
	public static void main(String[] args) {
//This is an Array
//A array is set to an exact size
		String[] cars = new String[3];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Acura";
		System.out.println(cars);
//Arraylist can be any size
//This is an ArrayList
		ArrayList <String> carList = new ArrayList<>();
		carList.add("honda");
		carList.add("toyota");
		carList.add("acura");
//		.remove can remove a single index
//		.clear can remove all in the list
		System.out.println(carList.contains("honda"));
		System.out.println(carList);

//This is a linkedList
		LinkedList<String> carsList = new LinkedList<>();
		carsList.add("honda");
		carsList.add("toyota");
		carsList.add("acura");
		System.out.println(carsList);
//Both function the exact same due to the fact they both fall under the collections' library.
//Arrays have random access which means it runs in constant time. So it can search and grab any element in the list at any time really fast.
//The LinkedList has to start at index 0 and go through each index till it fiends the one you want, so it's a lot slower.

//But to add or remove an element the arraylist has to create a whole new arraylist which is really slow
//But the linkedlist goes down the chain of nodes and adds or removes the element only affecting the neighboring links




	}

}
