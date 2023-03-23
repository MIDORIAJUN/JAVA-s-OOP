package study;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	//자동차의 시리얼 넘버
	private int id;
	//정적 멤버 변ㅅ로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자
	static int numbers = 0;
	
	//상수란? 한번 초기화되면 절대 값을 변경할 수 없는 값
	//자바에서 상수를 설정하려면 final keyword 사용
	//자바에서 상수는 static으로 만드는 것이 바람직
	//상수는 대문자로 사용하는 것이 관례
	//상수는 일반적으로 public으로 선언한다
	//static final int MAX_SPEED = 350;
	public static final int MAX_SPEED;
	static
	
	{
		MAX_SPEED = 350;
		System.out.println("MAX_SPEED가 초기화되었습니다.");
	}
	
	{
		model = "그랜저";
		color = "blue";
	}
	
	// 1. static 메소드는 인스턴스 메소드를 호출이 불가능.
	
	//만약 numbers메소드가 private라면?
	//private int numbers = 0;
	
//	public int getNumber() {
	    //print1();     //1.
//		return numbers;
//	}
	
//	public void print1() {   //1.
//		System.out.println("print");
//	}
	
	//생성자
	// id = ++number;
	public Car(String model,String color,int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
		
//		model = model; <= 매개변수 = 매개변수ㅋㅋㅋ
//		color = color;
//		speed = speed;
//		
		this.id = ++numbers;
		
		//MAX_SPEED = 500; <= 컴파일 에러
	}
	
	public void print() {
		System.out.println("모델: " + model + "색상: " + color + "속도: " + speed + "생산수:" + id);
	}
	
	public static void main(String[] args) {
		Car c1, c2, c3;
		c1 = new Car("s600","white",80);
		c2 = new Car("e500","blue",20);
		c3 = new Car("e300","gray",160);
		c1.print();
		c2.print();
		c3.print();
		//numbers메소드가 private인 경우
//		System.out.println(c1.getNumber());
//		System.out.println(c2.getNumber());
//		System.out.println(c3.getNumber());
		
		//자바의 수학관련 라이브러리 클래스는 정적 메소드를 이용
		double d = Math.sqrt(9);
		System.out.println("9의 제곱근:" + d);
		
		System.out.println(Car.MAX_SPEED);

	}

}
