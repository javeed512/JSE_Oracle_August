package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
			List<Object>  list =	new  ArrayList<Object>();
												// initial capacity is 10
		
					list.add(new String("hello"));
					list.add(new Integer(12));
					list.add(new Double(5.55));
					list.add(new Long(9999));
			
					System.out.println(list);

	}

}
