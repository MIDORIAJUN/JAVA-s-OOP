package study;

class Televison{
	private int channel; //채널
	private int volume;  //소리
	private boolean onOff;   //전원
	
	Televison(int c, int v, boolean o){ //생성자
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println(channel +" "+ + volume);
	}
}


public class 생성자 {
	private int x, y;
    private int width, height;
    
    public 생성자(int x, int y, int width, int height){//생성자
    	this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
         }
    
    public 생성자(){// 생성자 오버로딩
    }
    
    public 생성자(int width,int height){// 생성자 오버로딩
    	//생성자에 생성자를 호출시 먼저 생성자 this가 먼저 입력해야한다
         this(0,0,width,height);      //다른 생성자 호출
    }


	public static void main(String[] args) {  //클래스 메소드
		
		//생성자
		생성자 r = new 생성자(10,20); //3번 생성자
		r = new 생성자(1,1,3,500);  //다른 생성자 호출
		
		//Televison
		Televison tv = new Televison(7,10,true);
		tv.print();
		Televison tv2 = new Televison(11,20,true);
		tv2.print();

		
	}

}
