package FebSixteen;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<>();
		List.add("diet");
		List.add("jhg");
		List.add("miet");
		List.add("srm");
		List.add("kiet");
		//using iterator method
	Iterator <String> iterate = List.iterator();
		while(iterate.hasNext()) {
			String name = iterate.next();
		System.out.println(name);
		
		//using enhanced for loop
			
			for(String name1:List)
{
				System.out.println(name1);}
}
	}
		
		
		
		
	}


