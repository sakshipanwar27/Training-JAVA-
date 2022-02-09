class Student{
	private Integer Student_rollno;
	private String Student_name;
	private Integer Student_age;
	private String student_addres;
	
 public Integer getStudent_rollno() {
		return Student_rollno;
	}

	public void setStudent_rollno(Integer student_rollno) {
		Student_rollno = student_rollno;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public Integer getStudent_age() {
		return Student_age;
	}

	public void setStudent_age(Integer student_age) {
		Student_age = student_age;
	}

	public String getStudent_addres() {
		return student_addres;
	}

	public void setStudent_addres(String student_addres) {
		this.student_addres = student_addres;
	}

}
public class Employee{
	public static void main(String[] args) {
//		int a = 25;
//		int b= 25;
//		Integer c = 30;
//		Integer d = new Integer (30);
//		System.out.println(a==b);
//		System.out.println(c.equals(d));
//		System.out.println(c==d);
//		
		Student student1 = new Student();
		student1.setStudent_addres("Delhi");
		student1.setStudent_age(25);
		student1.setStudent_name("Sara");
		student1.setStudent_rollno(109);
		int age = student1.getStudent_age();
		System.out.println(age);
       System.out.println(student1.getStudent_name());		
       
	}
}