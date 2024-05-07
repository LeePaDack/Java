package com.kh.practice.file.model.dao;

import java.util.HashMap;
import java.util.Map;

public class FileDAO {
	private Map<String, String> files = new HashMap<>();
	
	// 파일 이름이 존재하는지 containsKey
	public boolean checkName(String file) {
		return files.containsKey(file);
	}
	
	// 파일 저장 유무 확인 put
	public void fileSave(String file, String s) {
		files.put(file, s);
		System.out.println("파일 저장 완료 : " + file);
	}
	
	// 파일 열기
		public StringBuilder fileOpen(String file) {
			// 파일이 만약 존재한다면 열자
			if(files.containsKey(file)) {
				System.out.println("파일 열기 완료 : " + file);
				return new StringBuilder(files.get(file));
			}
			else {
				System.out.println("파일이 존재하지 않습니다");
				return new StringBuilder(); // 파일 존재 X 전달할 내용이 없으
			}
		
		}
		
	// 파일 수정
		public void fileEdit(String file, String s) {
			if(files.containsKey(file)) {
				files.put(file, s);
				System.out.println("파일 수정 완료 : "  + file);
			}
			else {
				System.out.println("파일이 존재하지 않습니다.");
			}
		}
	
	
	
	
	
	
	
}
