package study;

class Lg{
	//인스턴스 변수
	int channel;//채널
	int volume;//볼륨
	boolean ison;//전원상태
	
	void print() { //인스턴스 메소드
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}
}

public class java {

	public static void main(String[] args) {
		Lg t = new Lg(); //객체생성
		
		t.channel = 7;
		t.volume = 9;
		t.ison = true;
		t.print();
		
		Lg t2 = new Lg();
		t2.channel = 7;
		t2.volume = 12;
		t2.ison = true;
		t2.print();
		

	}

}
