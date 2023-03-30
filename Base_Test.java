package study;

class Base {
	//오버로딩
	public Base() {
		System.out.println("Base() 생성자 호출됨");
	}
	
	public void Base(String msg) {
		System.out.println("Base() 생성자 호출됨");
	}
}
//public class Derived extends Base
class Derived extends Base{
	public Derived() {
		System.out.println("Dervied() 호출완료");
		// 부모 클래스의 생성자를 명시적으로 호출되지 않으면
		//묵시적으로 호출됨. 이 때 묵시적으로 호출되는 부모 클래스 생성자는
		//어떠한 인자도 가지지 않는 생성자
		Base("옛다");
	}
	
	public Derived(String a) { //d1
		System.out.println("Dervied() 호출완료");
		//super(msg);
	}

}

public class Base_Test {

	public static void main(String[] args) {
		Derived d = new Derived();
		Derived d1 = new Derived("홍길동"); //오버로딩
	}

}
