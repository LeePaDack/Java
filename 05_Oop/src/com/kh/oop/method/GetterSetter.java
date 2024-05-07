package com.kh.oop.method;
/*
Setter
  객체의 속성 값을 설정하는 메서드
  객체 외부에서 속성 값을 변경할 수 있음

Getter
  객체의 속성 값을 반환하는 메서드
  객체 외부에서 속성 값을 읽을 수 있음
  
  단축키 alt shift s 해준후 generate Getters and setters 설정해주면 됨 
 */
public class GetterSetter {
	// 필드 작성
	private String name; 
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
