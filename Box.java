package study;

public class Box {

	private int width, length,height;
	//private int vol;
	
	public Box(int w, int len, int h) { //생성자         // 1
		width = w;
		length = len;
		height = h;
		
		//vol = width * length * height;
	}
	
	public int getVolume(){             //인스턴스 메소드  // 2
		return width * length * height;
	}
	
	//Box 타입
	public static Box whoisLargerBox(Box box1, Box box2) {//3  //클래스 메소드 //인스턴스 할 필요가 없는 것은 이미 멤버변수에 참조변수객체가 생성됬기 때문 
		if(box1.getVolume() > box2.getVolume()) {          
			return box1; //바로 종료
		}
		return box2;
	}
	public static void main(String[] args) {
		 Box b = new Box(10,20,50);    //b의 주소로 저장    // 1
		 Box b1 = new Box(10,30,30);   //b1의 주소로 저장   // 1
//		 Box b1 = new Box(); // <= 인자값이 없으므로 error
		 System.out.println("1번째 박스의 부피:" + b.getVolume());   //2
		 System.out.println("2번째 박스의 부피:" + b1.getVolume());  //2
		 
		 //값이 Box타입 이므로 저장할 변수를 Box타입의 변수에 저장한다
		 Box largerBox = Box.whoisLargerBox(b, b1); //인자값이 참조변수(객체) //클래스 변수이므로 그냥 불러오기 가능  // 3
		 System.out.println("더큰 박스의 부피:" + largerBox.getVolume());

	}

}
