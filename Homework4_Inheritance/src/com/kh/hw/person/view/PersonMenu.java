package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	// 사용자한테 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	// 1번 사람 컨트롤러 가져오기
	PersonController pc = new PersonController();
	
	// 학생을 추가하거나 조회할 것
	
		public void mainMenu() {
		while(true) {
			System.out.println("=== 메인 메뉴 ===");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 enter 없애기
			
			// 번호를 선택할 수 있는 switch 소환
			switch(choice) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	//학생을 추가하거나 조회할 것
	public void studentMenu() {
		while(true) {
			System.out.println("=== 학생 메뉴 ===");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 출력");
			System.out.println("0. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				insertStudnet();
				break;
			case 2:
				printStudent();
				break;
			case 0:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("=== 사원 메뉴 ===");
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 출력");
		System.out.println("0. 이전 메뉴로");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			insertEmployee();
			break;
		case 2:
			printEmployee();
			break;
		case 0:
			System.out.println("이전 메뉴로 이동합니다.");
			return;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
	}
	
	public void insertStudnet() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		// 2번 학생 추가 넣기
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("학생이 추가되었습니다.");
	}
	
	public void insertEmployee() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		// 2번 사원 추가 넣기
		pc.insertStudent(name, age, height, weight, salary, dept);
		System.out.println("사원이 추가되었습니다.");
	}
	
	// 학생이 얼마나 존재하는지 출력하기
	public void printStudent() {
		// 학생정보가 들어있는 Student 장바구니 모양의 배열 가져오기
		Student[] students = pc.printStudents();
		System.out.println("=== 학생 목록 ===");
		// for each
		for(Student s : students) {
			// 만약에 안에가 비어있지 않다면 학생들을 보여줄 것
			if(s != null) {
				System.out.println(s);
			}
			else {
				System.out.println("보여줄 학생 정보가 없습니다.");
			}
		}
	}
	
	public void printEmployee() {
		Employee[] employee = pc.printEmployee();
		System.out.println("=== 사원 목록 ===");
		for(Employee e : employee) {
			if(e != null) {
				System.out.println(e);
			}
			else {
				System.out.println("보여줄 사원 정보가 없습니다.");
			}
		}
	}
}