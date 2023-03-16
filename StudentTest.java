package study;

public class StudentTest {

	public static void main(String[] args) {
		Student obj1 = new Student(); //1번 생성자
		System.out.println(obj1);
		
		Student obj2 = new Student(111,"kim",25); //2번 생성자
		System.out.println(obj2);

	}

}
