package study;
//import test.Person;

public class PersonTest {
	
	public static void main(String[] args) {
//		p.name = "TISSOT"; 접근제어자 private이므로 클래스만 가능하지 패키지 이상은 접근이 불가능하다
//		p.age = 23;
//		p.age = -100;
		
		Person p = new Person();
		p.setAge(20);
		p.setAge(-20);
		System.out.println(p.setAge());
		
//		p.age2(200);
		
		System.out.println(p.getName());
		System.out.println(p.getdept());
		
		//String d = p.dept; 접근불가
	
	}

}
