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
			}//if
			if(input.contains("www")) { //contains메소드로 해당 문자열에 원하는 문자열이 있는지 찾는 단계
				System.out.println(input + "은 'www'로 시작합니다");
			}else {
				System.out.println(input + "은 'www'로 시작하지 않습니다");
			}
		}//while
		
		// ======= 다른 방법 ===========
		
		while(true) {
			System.out.println("문자열 입력>>(quit 종료)");
			String input = scn.next();
			//www문자 검사 단계
			if(input.equals("quit")) {
				break;
			}//if
			
			int count = 0;
			for(int i = 0; i < 3; i++) {
				char ch = input.charAt(i);
				if(ch == 'w') {
					count += 1;
				}
			}//for
			if(count == 3) {
				System.out.println(input + "은 'www'로 시작합니다");
			}else {
				System.out.println(input + "은 'www'로 시작하지 않습니다");
			}
		}//while

	}

}
