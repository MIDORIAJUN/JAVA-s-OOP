package study;

public class Mycounter {
	private int value;
	
	public static void add1(int val) { // 인스턴스 메소드
		val = val + 1;
	}
	public void setValue(int value) { //2
		this.value = value;
	}
	
	public int getValue() { //3
		return value;
	}
	
	public static void increase(Mycounter cntObj) { //클래스 메소드 //4
		int v = cntObj.getValue() + 1;              //5 => 2
		cntObj.setValue(v);                         // => 2
	}
	
//	public void increase(Mycounter cntObj) {
//		int v = cntObj.getValue() + 1;
//		cntObj.setValue(v);
//	}

	public static void main(String[] args) {
		
		// call by value
//		int val = 10;
//		Mycounter.add1(val); //실행하고 나서 메모리에서 사라짐
//		
//		System.out.println(val); //위 메소드가 사라졌기 때문에 int val이 남아서 출력됨 
		
		Mycounter mc = new Mycounter();
		mc.setValue(10); //2
		Mycounter.increase(mc); //4  | 11로 교체
		System.out.println(mc.getValue());  //5
		System.out.println(mc.value);       //다른곳에서 실행시 에러: private value
	}

}
