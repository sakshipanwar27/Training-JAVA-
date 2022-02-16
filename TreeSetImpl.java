package FebSixteen;

import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Java");
		ts.add("C++");
		ts.add("C");
		ts.add("HTML");
		ts.add("Python");
		ts.add("Ruby");
		

		System.out.println(ts);
		System.out.println(ts.descendingSet());
		System.out.println(ts.contains(".NEt"));
		System.out.println(ts.hashCode());
        ts.clear();

		System.out.println(ts);
		System.out.println(ts.isEmpty());
		
		//System.out.println(ts.subSet(2,5));

	}

}