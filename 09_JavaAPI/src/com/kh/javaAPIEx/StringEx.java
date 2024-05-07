package com.kh.javaAPIEx;
/*
String : 문자열을 나타내는 클래스
		 문자열을 생성하고 조작하는데 사용
		 
String str = new String();  - String 에서 이 방식은 사용하지 않음
String str = "";   - 이 방법 사용

코딩테스트나 문자를 자르고 변경할 때 사용하는 메서드를 작성

substring = 내가 시작하고싶은 숫자부터 끝내고 싶은 숫자값을 지정해서 변경할 수 있음
substring(시작숫자, 끝나는숫자) = 인덱스
substring(시작숫자) = 시작 숫자부터 끝나는 숫자까지 모두 변경하거나 사용

toUpperCase() = 원하는 문자열을 모두 대문자로 변환
toLowerCase() = 원하는 문자열을 모두 소문자로 변환
trim() = 원하는 문자열의 앞 뒤 공백을 모두 제거해서 리턴
split() = 문자열을 특정 구분자를 기준으로 분할하여 문자열 배열로 반환
replace() = 문자열에서 특정 문자열을 새로운 문자열로 대체
charAt() = 문자열에서 주어진 인덱스에 해당하는 문자를 반환a



 */
public class StringEx {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		
		// 가비지 컬랙션 (garbage collection)
		// 코딩엣 사용하고 사용되지 않는 것을 자동으로 없애는 것
		String phone = "010";
		phone += "1234 -5678";
		System.out.println(phone);
		
		
		
		/*            01234 5 6789 10 11
		String 문자열 = "Hello Worl d !";
		 */
		
		String 문자열 = "Hello World!";
		
		// 1. substring()
		String 서브스트링 = 문자열.substring(6);
		System.out.println(서브스트링);
		String 서브스트링1 = 문자열.substring(6, 8); // 6 부터 7 까지만 보여준다는 의미
		System.out.println(서브스트링1);
		
		// 2. toUpperCase()
		String 대문자 = 문자열.toUpperCase();
		System.out.println("대문자 : " + 대문자);
		
		// 3. toLowerCase()
		String 소문자 = 문자열.toLowerCase();
		System.out.println("소문자 : " + 소문자);
		
		// 4. trim()
		String 공백가득 = "    Hello  World!   ";
		String 공백제거 = 공백가득.trim();
		System.out.println("공백 제거 : " + 공백제거); // 무조건 양쪽 공백 제거*
		
		// 5. split()  문자열을 특정 구분자를 기준으로 분할해서 문자열 배열로 반환
		String 과일들 = "apple,banana,grape";
		String 과일배열[] = 과일들.split(",");
		for(String 과일 : 과일배열) {
			System.out.println(과일);
		}
		
		// 6. replace()  특정 문자열을 새로운 문자열로 대체
		String 헬로우월드 = "Hello World!";
		String 변경 = 헬로우월드.replace("Hello", "Hi");
		System.out.println(변경);
		
		// 7. charAt()  문자열에서 주어진 인덱스에 해당하는 문자 하나를 반환
		String 하이월드 = "Hi, World";
		char ch = 하이월드.charAt(8);
		System.out.println(ch);
	
	
	}	

}
