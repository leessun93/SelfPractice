package com.javaex.selfpractice;

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
		
		
		
		
		
		
		
		
		
		
		
	}

}
