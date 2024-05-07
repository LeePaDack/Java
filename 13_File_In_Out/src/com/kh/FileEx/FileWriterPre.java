package com.kh.FileEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre {
	public static void main(String[] args) {
		// Hello World.txt 파일에 나는 자바가 너무 재미있다 라는 내용을 작성하고
		// 파일을 저장하기
		// 헬로우월드에 자바는 정말정말 재밌다. 라는 말을 이어쓰기
		String 헬로우월드 = "Hello World.txt";
		
		FileWriter 글쓰기;
		try {
			글쓰기 = new FileWriter(헬로우월드, true);
			// \n 줄바꿈으로 이어쓰기 가능
			String 내용 = "자바는 정말정말정말 재밌다.";
			글쓰기.write(내용);
			글쓰기.close();
			System.out.println("파일글쓰기 성공");
			
		} catch (IOException e) {
			System.out.println("파일글쓰기 실패");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
