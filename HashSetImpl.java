package FebSixteen;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetImpl {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		hset.add("java");

		hset.add("ff");

		hset.add("grg");
		hset.add("jdqw");
		hset.add(null);
		hset.add(null);
		System.out.println(hset);

		// boolean var = hset.isEmpty();
		System.out.println(hset.isEmpty());

		System.out.println(hset.hashCode());
		
//		hset.clear();
//		System.out.println(hset);
		// hset.removeAll(hset);
		// System.out.println(hset);
		
		String array[] = hset.toArray(new String[hset.size()]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
			ArrayList<String> namesList = new ArrayList<>(hset);
			System.out.println(hset);

	}

}

