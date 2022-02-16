package FebSixteen;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
	
	 public static void main(String[] args) {
		/*   head ---- node*/
		LinkedList<String> list=new LinkedList<String>();
		list.add("sara");
		list.add("rashi");
		list.add("saksra");
		list.add("sanjana");
		//Add on last position
//		
//		
//		list.addLast(" JAI");
//		
//		//Add on first position
//		
//		list.addFirst("Noni");
//		
//		//remove
//		list.remove(3);
//		
//		Iterator<String> iterate = list.iterator();
//		
//		
//		while(iterate.hasNext()) {
//			String name = iterate.next();
//			
//			System.out.println(name);
//			
//			int pos = list.lastIndexOf("rashi");
//			System.out.println(pos);
			
			
	System.out.println(list);
	List s = list.subList(2, 4);
	System.out.println(s);
			
		}
		
	}

