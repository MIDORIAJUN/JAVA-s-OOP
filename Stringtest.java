package study;

public class Stringtest {

	public static void main(String[] args) {
		String pro = "A barking dog ";
		String s1,s2,s3,s4;
		
		System.out.println(pro.length());
		s1 = pro.concat("never bit"); //문자열 이어	붙이기
		System.out.println(s1);
//		System.out.println(pro.concat("never bit"));
		
		s2 = pro.replace('A', 'a'); //바꿀 문자열을 원하는 문자로 바꿔지는 메소드 
		System.out.println(s2);
//		System.out.println(pro.replace('A', 'a'));
		
		s3 = pro.substring(2,5); //문자열에서 해당 범위에 있는 문자열을 반환
		System.out.println(s3);
//		System.out.println(pro.substring(2,5));
		
		s4 = pro.toUpperCase(); //모든 문자열을 대문자 바꿔서 반환기능
		System.out.println(s4);
//		System.out.println(pro.toUpperCase());
		
		int x = 20;
		System.out.println("결과값: " + x);
		System.out.println("'100' + x: " + "100" + x);
		System.out.println(100 + x); //120
		System.out.println("100 + x : " + 100 + x); // 10020 <= 문자열 같이 쓰면 계산 안됌
		
		String s = "1234";
		int n = Integer.parseInt(s);
		System.out.println(n);
		String n1 = Integer.toString(n);
		System.out.println(n1.getClass()); //String
	}

}
