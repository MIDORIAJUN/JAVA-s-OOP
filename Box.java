package study;

public class Box {

	private int width, length,height;
	//private int vol;
	
	Box(int w, int len, int h) { //생성자
		width = w;
		length = len;
		height = h;
		
		//vol = width * length * height;
	}
	
	public int getVolume(){
		return width * length * height;
	}
	
	public static Box whoisLargerBox(Box box1, Box box2) { //클래스 메소드 //인스턴스 할 필요가 없는 것은 이미 멤버변수에 참조변수객체가 생성됬기 때문
		if(box1.getVolume() > box2.getVolume()) {
			return box1;
		}
		return box2;
	}
	public static void main(String[] args) {
		 Box b = new Box(10,20,50);
		 Box b1 = new Box(10,30,30);
//		 Box b1 = new Box(); // <= 인자값이 없으므로 error
		 System.out.println("1번째 박스의 부피:" + b.getVolume());
		 System.out.println("2번째 박스의 부피:" + b1.getVolume());
		 
		 Box largerBox = Box.whoisLargerBox(b, b1);
		 System.out.println("더큰 박스의 부피:" + largerBox.getVolume());

	}

}
