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
	
	/*
	 * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box인지 체크하는 메소드
	 * 같으면 true, 다르면 false를 반환
	 */
	public boolean isSameBox(Box box) {
		/*
		 * 나의 width,Length,height가 인자로 주어진 box의 그것과 모두 같으면 true를 반환,
		 * 그렇지 않으면 false
		 */
		if(box.width == this.width && this.length == box.length && this.height == box.height) // 
			return true; //여기서 종료하므로 else는 생략가능
		return false;
	}
	
	public static void main(String[] args) {
		 Box b = new Box(10,20,50);    //b의 주소로 저장    // 1
		 Box b1 = new Box(10,30,30);   //b1의 주소로 저장   // 1
//		 Box b1 = new Box(); // <= 인자값이 없으므로 error
		 System.out.println("1번째 박스의 부피:" + b.getVolume());   //2
		 System.out.println("2번째 박스의 부피:" + b1.getVolume());  //2
		 
		 //값이 Box타입 이므로 저장할 변수를 Box타입의 변수에 저장한다
		 Box largerBox = Box.whoisLargerBox(b, b1); //인자값이 참조변수(객체) //클래스 변수이므로 그냥 불러오기 가능  // 3
		 boolean result = b.isSameBox(b1);          //false
		 System.out.println("박스와 박스1는 같다:" + result);
		 System.out.println();
		 System.out.println("더큰 박스의 부피:" + largerBox.getVolume());
		 //System.out.println(b1.width);

	}

}
