import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OOP {
// Four basic pillars Abstraction, Polymorphism, Inheritance, and Encapsulation.



//	Polymorphism is using the same method name but with different parameters

	public static int add(int num, int num2){
		return num + num2;
	}
//	This is an example of overloading is when you copy a static method and add to it.
	public static int add(int num, int num2, int num3){
		return num + num2 + num3;
	}

//	This is an example of method clone()
//	public class Person implements Cloneable{
//		int age;
//		String name;
//		float[] f;
//		public Person clone(){
//			try{
//			Person personClone = new Person();
//				personClone.age = this.age;
//				personClone.name = this.name;
//				if(this.f !=null) {
//					personClone.f = this.f.clone();
//				}
//				return personClone;
//		} catch(CloneNotSupportedException ex){
//
//		}
//}





	public static void main(String[] args) {
		MultiThread myThread = new MultiThread();

	System.out.println(add(1,2));
	Car car1 = new Car("Honda", "Civic", 1994 );
	Car car3 = new Car("Acura", "Integra", 1996);
//	Hashset
	Set<String> set = new HashSet<String>();
	set.add("Cat");
	set.add("Dog");
		System.out.println(set);
		set.add("Bird");
		set.add("Cat");
		System.out.println(set);
//	Hashmap <Key, Value>
	Map<String, String> map = new HashMap<String, String>();
	map.put("Name", "Ian");
	map.put("Location", "Texas");
		System.out.println();
		System.out.println(map);
		System.out.println();
		System.out.println();

		Car car2 = new Car(car1);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		System.out.println();
		myThread.start();
	}
}

