package study;

public class Time {
	private int hour;
	private int min;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int h,int m,int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		min = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 24) ? s : 0);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, min, second);
	}
	
	public static void main(String[] args) {
	Time t = new Time();
	System.out.println("기본 생성자 호출 후 시간:" + t.toString());
	
	Time ti = new Time();
	System.out.println("두번째 생성자 호출 후 시간:" + ti.toString());

	}

}
