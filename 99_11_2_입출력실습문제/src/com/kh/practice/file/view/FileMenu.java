package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// 키보드로 입력받을 스캐너 작성
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		System.out.println("1. 파일 저장");
		System.out.println("2. 파일 열기");
		System.out.println("3. 파일 편집");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine(); // 남아있는 엔터 지우기
		
		switch(choice) {
		case 1:
			fileSave();
			break;
		case 2:
			fileOpen();
			break;
		case 3:
			fileEdit();
			break;
		case 4:
			System.out.println("프로그램이 종료됩니다.");
			System.exit(0); // 밖으로 내보낼거야 라는 다른 말중 하나
			//return;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	// 1. 파일 저장
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		// 만약 파일이 존재한다면
		if(fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		}
		else {
			System.out.print("작성할 내용 입력 : ");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	
	// 파일 열기
	public void fileOpen() {
		System.out.print("열어줄 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일 내용 : " + fileContent);
	}
	
	// 파일 수정
	public void fileEdit() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		// 파일이 없다면 파일이 존재하지 않습니다. 
		
		System.out.println("현재 파일 내용 : " + fileContent);
		System.out.print("새로운 내용 입력 : ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}
	
	
	
	
}
