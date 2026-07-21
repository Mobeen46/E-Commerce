package Garbage_collection;

import java.util.Vector;

public class VL_practice {

	public static void main(String[] args) {
		Vector aa = new Vector();
		aa.add("first");
		aa.add(0,"secound");
		Vector aa2 = new Vector();
		aa2.add("three");
		aa2.add("four");
		
		aa.addAll(aa2);
		aa2.remove("four");
		System.out.println(aa);
		System.out.println(aa2);
		/*
		System.out.println("size :" +aa.size());
		System.out.println("size :" +aa.capacity());
*/
	}

}
