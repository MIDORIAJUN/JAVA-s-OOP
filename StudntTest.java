package study;

public class StudntTest {

	public static void main(String[] args) {
		Student std = new Student();
//		std.name = "casio";    //프라이빗이므로 사용불가
//		std.birthYear = 2002;
		
		std.setName("casio");
		std.setBirthYear(2002);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());

	}

}
