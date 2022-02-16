package FebSixteen;

import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {

//		LinkedHashSet<String> hset = new LinkedHashSet<>();
//		
//		hset.add("Java");
//		hset.add("C++");
//		hset.add("C");
//		hset.add(null);
//		hset.add(null);
//		for(String name : hset)
//	{
//		System.out.println(name);
//	}
//		
		LinkedHashSet<Student> hs = new LinkedHashSet<Student>();

		Student s = new Student(1, "Sakshi", "Panwar");
		Student s1 = new Student(2, "Sara", "Choudhary");
		Student s2 = new Student(3, "Jai", "Kumar");
		Student s3 = new Student(4, "Vini", "Dabas");
		Student s4 = new Student(5, "Sarakashi", "Panwar");

		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);

		for (Student stu : hs) {

			System.out.println(" The student are" + stu.roll + " " + stu.fname + stu.lname);
		}

	}
}
