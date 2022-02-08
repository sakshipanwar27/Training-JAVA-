package firstJavaProject;
class Person{
	private String personName;
	private int personAge;
	private String person_address;
	
	protected Person() {
		
	}
	protected Person(String personName, int personAge, String person_address) {
		this.personName=personName;
		this.personAge= personAge;
		this.person_address=person_address;
		
	}
	public void display() {
		System.out.println(personName+ " "+personAge+ " "+person_address);
	}
	
}

public class Per {
	public static void main(String[] args) {
		Person person = new Person("Sara", 23,"Gzb");
		person.display();
	}

}
