package FebSixteen;

import java.util.ArrayList;
import java.util.Vector;

public class VectorImpl {
	public static void main(String[] args) {
		// Vector vc = new Vector();
		Vector<String> vc = new Vector<String>(2);
		vc.addElement("Car");
		vc.addElement("bike");
		vc.addElement("train");

		vc.addElement("Boat");

		vc.addElement("scooty");

		vc.addElement("Bus");
		vc.addElement(null);
		vc.addElement(null);
		System.out.println(vc);
		System.out.println(vc.capacity());

		//convert vector to 
		ArrayList<String> arr = new ArrayList<String>(vc);
		
		for(String s :arr) {
		//System.out.println(s);
	}

		//array
		String [] array =vc.toArray(new String[vc.size()]);
		for(int i =0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
}
}

