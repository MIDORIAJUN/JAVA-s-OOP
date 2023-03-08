package study;

public class Car1 {
	String color; //색상
    int speed;    //속도
    int gear;     //기어
    
    public String toString() {
    	return "Car1 [color=" + color + ", speed=" + speed + ", gear =" + gear + "]";
    }
    
    void changeGear(int g) {
    	gear = g;
    }
    
    void speedUp() {
    	speed = speed + 10;
    }
    
    void speedDown() {
    	speed = speed - 10;
    }
	public static void main(String[] args) {
	
		Car1 cc = new Car1();
		cc.changeGear(1);
		cc.speedUp();
		System.out.println(cc);
	}

}
