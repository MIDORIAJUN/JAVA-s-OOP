package study;

import java.util.Scanner;

public class Str_test_236 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 입력>>(quit 종료)");
			String input = scn.next();
			//www문자 검사 단계
			if(input.equals("quit")) {
				break;
			}
			if(input.contains("www")) { //contains메소드로 해당 문자열에 
				System.out.println(input + "은 'www'로 시작합니다");
			}else {
				System.out.println(input + "은 'www'로 시작하지 않습니다");
			}
		}//while

	}

}
