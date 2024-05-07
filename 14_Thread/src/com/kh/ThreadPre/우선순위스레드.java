package com.kh.ThreadPre;

public class 우선순위스레드 {
	
	public static void main(String[] args) {
		// for 문으로 1 부터 3 까지 반복
		// 1 ~ 3 까지 차례대로 실행할 수 있도록 설정
		for(int i = 1; i < 4; i++) {
			Thread t = new 스레드연습(i);
			
			if(i == 1) {
				t.setPriority(Thread.MAX_PRIORITY); 
			}
 			else if(i == 2) {
				t.setPriority(Thread.NORM_PRIORITY); 
			}
 			else {
 				t.setPriority(Thread.MIN_PRIORITY);
 			}
			t.start();
			
		}
		System.out.println("메인 끝");
		
	}
	
}
