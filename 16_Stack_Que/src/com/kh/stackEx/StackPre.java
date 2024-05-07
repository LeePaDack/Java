package com.kh.stackEx;

import java.util.Stack;

public class StackPre {
	// main 메인 메서드 에서 작성
	
	public static void main(String[] args) {
		// Stack 을 활용해서 10 30 50 40 20 을 넣고 push 사용
		// 맨 위 값을 지우고 확인해서 반환 pop
		// 현재 맨 위 값 확인 peek
		// 비어있는지 확인 isEmpty
		// 크기는 몇인지 확인 size
		
		Stack<Integer> num = new Stack<>();
		
		num.push(10);
		num.push(30);
		num.push(50);
		num.push(40);
		num.push(20);
		System.out.println(num);
		
		int Top = num.pop();
		System.out.println(Top);
		
		int Peek = num.peek();
		System.out.println(Peek);
		
		boolean Empty = num.isEmpty();
		System.out.println(Empty);
		
		int Size = num.size();
		System.out.println(Size);
		
	}
}
