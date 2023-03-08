package study;

public class Java_start {

	public static void main(String[] args) {
		Java t1 = new Java();
	    // t1.name = "HongGilDong"; // private 로 선언되어있기 때문에 에러
	    // System.out.println(t1.name); // 에러

	    t1.setName("Hello, world");
	    System.out.println(t1.getName());

	}

}
