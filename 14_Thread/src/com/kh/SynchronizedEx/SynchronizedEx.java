package com.kh.SynchronizedEx;
/*
Synchronized
	멀티 스레드 환경에서 공유하는 데이터에 공기화를 제공
	여러 스레드가 하나에 동시에 접근할 때 발생할 수 있는 문재를 해결
	
	특정 코드 영억을 잠금처리해서 한 번에 하나의 스레드만 접근할 수 있음

 */
public class SynchronizedEx {

	private static int 숫자 = 0;
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			//람다식
			Thread t = new Thread(() -> {
				synchronized (SynchronizedEx.class) {
					숫자++;
					System.out.println("숫자들 : " + 숫자);
				}
			});
			t.start();
		}
		
		
		
	}
	
	
	
	
}
