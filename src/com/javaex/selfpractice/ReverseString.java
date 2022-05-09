package com.javaex.selfpractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//스트링 버퍼 기본 생성
		StringBuffer sb = new StringBuffer();
		
		//append = 문자열 추가
		sb.append("하이");
		
		System.out.println("SB를 알아보자 :");
		
		System.out.println(sb.toString());
		
		sb.append("하이2트");
		
		System.out.println( sb.toString());
		//어팬드에 계속 쌓이나보다

		//insert 원하는 위치에 추가
		sb.insert(2, "다음으로"); // 2번째 위치에 다음으로를 추가하였다.
		
		System.out.println( sb.toString());
		
		//리버스 뒤집기
		sb.reverse();
		
		System.out.println("리버스로 뒤집자 :" + sb.toString());
		
		
		//delete 지운다 몇번부터 몇번까지 숫자는 배열과같은 0이 1번이다.
		sb.delete(1, 5);
		
		System.out.println("딜리트로 지운다 :" + sb.toString());
		
		sb.deleteCharAt(3); //3번째 문자열인 음 다음문자열 다를 지운다
		
		System.out.println("딜리트찰 엣 으로지운다 :" + sb.toString());
		
		//replace 로 문자열 일부분을 다른문자로 치환한다
		// 문자열의 인덱스는 0부터 시작하며, start 인덱스부터 (end-1) 인덱스까지가 치환됨 중요!
		sb.replace(0, 5, "안녕하시렵니까?");
		
		System.out.println("리플레이스로 바꾼다 :"+ sb.toString());
		
		sb.delete(0, 7);
		System.out.println(sb.toString());
		//문제 : abcdef 를 입력받아 fdecba로 출력하시오
		
		String reverse = sc.nextLine();
		
		StringBuffer sb2 = new StringBuffer(reverse); 		
	
		sb2.reverse();
		
		System.out.println("바꾼 입력값 :" + sb2.toString());
		
		sc.close();
	}

}
