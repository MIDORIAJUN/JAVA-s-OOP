package study;

public class Java_start {

	public static void main(String[] args) {
		Java1 t1 = new Java1();
	    // t1.name = "HongGilDong"; // private 로 선언되어있기 때문에 에러
	    // System.out.println(t1.name); // 에러

	    t1.setName("Hello, world");
	    System.out.println(t1.getName());
	    
	    Java1.sayhello();
	    
	    String s = "longines";
	    char c = s.charAt(5);
	    System.out.println(c);
	    
	    String s1 = "longines";
	    
	    System.out.println(s1 == s); //메모리 주소값이 동일함 문자열 리터럴이 동일할 경우 동일한 리터럴을 저장하지 않음 그냥 같은 메모리 주소에 저장된 원래 값(리터럴)을 그대로 둠
	    
	    String s3 = new String("longines");  //새 객체 생성
	    System.out.println(s1 == s3); //단 동일한 리터럴을 새롭게 객체를 생성한것만 주소가 다르므로 false가 뜬다.
	    
	    boolean r = s3.equals(s1); //값만 비교
	    System.out.println("s3.equals(s1): " + r);
	    
	    s1 = new String("I love you");
	    s = new String("I Love you");
	    System.out.println("s1.equals(s): " + s1.equals(s));
	    
	    //String 객체는 imnnutable이다. mutable이 아니다.
	    //이말은 String 객체의 값은 변경이 불가능하다.

	}

}
