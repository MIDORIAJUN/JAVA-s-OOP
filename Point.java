package study;

public class Point {

	private int x,y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	//부모로부터 상속받은 메소드를 재정의 하는것을 오버라이딩이라고 함
	//overriding
	
	public String toString() {
		return "point[x=" + x + ", y=" + y + "]";
	}
	
	
	public static void main(String[] args) {
		

	}

}
