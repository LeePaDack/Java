package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	// Book bArr[] = new Book[];
	
	// 기본 생성자
	public BookMenu() {
	}
	
	public void mainMenu() {
		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램종료");
		System.out.print("메뉴를 고르세요 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 9:
			System.out.println("잘못입력하셨습니다.");
			return;
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
