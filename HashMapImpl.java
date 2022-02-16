package FebSixteen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {
		
		// store key value
		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		hmap.put(2, "Aarvi");
		hmap.put(123, "Sakshi");
		hmap.put(45,"SARA");
		hmap.put(null,null);
		System.out.println(hmap);
		
		Set set =hmap.entrySet();
		
		Iterator iterate=set.iterator();
		
		//Iterator iterate = hmap.iterate();
		while(iterate.hasNext()) {		
	        
			Map.Entry entry= (Map.Entry)iterate.next();
			System.out.println("key is "+ entry.getKey() +" "+" Value is "+entry.getValue());

		
		
		
	}
	
	}
}