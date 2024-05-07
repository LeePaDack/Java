import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		// 사용자에게 입력받을 공간을 생성 
		// Scanner를 이용해서 입력받은 내용을 검퓨터에 표시해줌
		// System.in 사용해서 키보드 입력을 읽어올 때 사용
		// Scanner 자료형 자리에 int 혹은 String 혹은 실수 boolean 값을
		// 확정지어서 나타낼 수 없기 때문에 초기에는 Scanner 라고 사용
		
		// nextLine() : 문자 또는 엔터를 치기 전 까지는 문장 전체를 입력 받음
		// 입력된 문자를 모두 다 가져옴
		// (띄어쓰기, 특수문자 등등 모두)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자의 이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("사용자의 사는 곳을 입력하세요.");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.println("사용자의 핸드폰 번호를 입력하세요.");
		String phoneNumber = sc.nextLine();
		System.out.println(phoneNumber);
		// int float double 등등 쓸 수 있음
		
		// Scanner String 을 사용해서 
		// 사용자의 키, 사용자의 나이, 사용자의 닉네임을 입력받기
		
		// 사용자의 키 String height
		// 사용자의 나이 String age
		// 사용자의 닉네임 String nickName
		
		System.out.print("사용자의 키 입력 : ");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.print("사용자의 나이 입력 : ");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.print("사용자의 닉네임 입력 : ");
		String nickName = sc.nextLine();
		System.out.println(nickName);
		
		
	}

}