package study;

interface OperaterCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}

class AutoCar implements OperaterCar{
	public void start() {
		System.out.println("자동차 출발");
	}
	
	public void stop() {
		System.out.println("자동차 정지");
	}
	
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿈");
	}
	
	public void turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "도 만큼 바꿉니다.");
	}
}

public class AutoCarTest {

	public static void main(String[] args) {
		OperaterCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();

	}

}
