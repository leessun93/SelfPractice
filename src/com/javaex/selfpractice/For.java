package com.javaex.selfpractice;

import java.util.ArrayList;
import java.util.Random;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 100까지의 숫자의 합을 출력하시오
		
		int sum = 0;
		
		for(int i=1; i <= 100; i++){
			
			sum = sum + i;
			 
		}
		System.out.println(sum);
		
		//for 문을 이용하여 구구단 2단을 만드세요
		
		for(int i=1; i<=9; i++) {
			
			sum = 2*i;
			
			System.out.println("2 *" + i + "=" + sum);
		}
		
		//for 문을 이용하여 구구단 전체를 만드세요
		
		for(int x=2; x<=9; x++) {
			
			
			for(int y=1; y<=9; y++) {
				
				System.out.println(x+"단 ="+ x+ "*" + y + "="+ x*y);
				
			}

		}
		//for 문을 이용하여 구구단 3단에서 4의배수를 제외하고 출력하시오
		
		for(int i=1; i<=9; i++) {
		
			
			if(i%4 != 0) {
				System.out.println("4의배수가 아닌수 =" +3*i);
			}else {
				System.out.println("4의 배수인 수"+ 3*i);
			}
			
		}
		
//		Random을 사용하여 for문으로 커피 주문 알고리즘 만들기
		Random rand = new Random();
		
		
		ArrayList<String> coffee = new ArrayList<String>();
		
		coffee.add("캬라멜마끼아또");
		coffee.add("아메리카노");
		coffee.add("카페모카");
		
		System.out.println(coffee);
		
		ArrayList<String> customer = new ArrayList<String>();
		customer.add("김칠복");
		customer.add("박순자");
		customer.add("최영순");
		customer.add("정동남");
		
		System.out.println(customer);
		
		
		

		for(int i = 0; i<customer.size(); i++) {
			int x = rand.nextInt(customer.size());
			int y = rand.nextInt(coffee.size());
			System.out.println(customer.get(x) +"손님 주문하신"+ coffee.get(y)+"나오셨습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
