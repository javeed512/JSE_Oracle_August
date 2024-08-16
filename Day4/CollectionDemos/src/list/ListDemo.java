package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		// Resizable array as DS
		List<Integer> list1 = new ArrayList<Integer>(4);
		
		//	List<String>  		list1 = new LinkedList<String>();

		list1.add(55);// new Integer(55);
		list1.add(33);
		list1.add(99);
		list1.add(22);
		list1.add(11);
		list1.add(88);
		list1.add(99);
		list1.add(null);

		System.out.println(list1); // insertion order is preserved

		System.out.println("Using Iterator ");
		Iterator<Integer> it = list1.iterator();
		while (it.hasNext()) {
			Integer i = it.next();

			System.out.println(i);
		}
		System.out.println("Using for each loop");
		for (Integer x : list1) {
			System.out.println(x);
		}

	}

}
