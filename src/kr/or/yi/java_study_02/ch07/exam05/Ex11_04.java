package kr.or.yi.java_study_02.ch07.exam05;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_04 {
	public static void main(String[] args) {
		HashMap<String, Phone> phoneManagement = new HashMap<String, Phone>();
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 관리 프로그램입니다.");
		int num = 0;
		while (num < 5) {
			System.out.print("메뉴를 선택해주세요. (1:삽입, 2:삭제, 3:찾기, 4:전체보기 5:종료) >> ");
			num = sc.nextInt();
			switch (num) {
			case 1: {
				insertPhone(sc, phoneManagement);
				break;
			}
			case 2: {
				deletePhone(sc, phoneManagement);
				break;
			}
			case 3: {
				searchPhone(sc, phoneManagement);
				break;
			}
			case 4: {
				System.out.println("지금 현재 저장된 전화번호 부");// 4
				allPhone(phoneManagement);
				break;
			}
			}
		}
		System.out.println("종료");
		sc.close();
	}

	private static void allPhone(HashMap<String, Phone> phoneManagement) {
		
		
	}

	private static void searchPhone(Scanner sc, HashMap<String, Phone> phoneManagement) {
		System.out.print("찾으시는 이름을 입력해주세요. >> ");// 3
		String name = sc.next();
		System.out.println(phoneManagement.get(name));
	}

	private static void deletePhone(Scanner sc, HashMap<String, Phone> phoneManagement) {
		System.out.print("삭제할 이름을 입력해주세요. >> ");// 2
		String name = sc.next();
		phoneManagement.remove(name);
	}

	private static void insertPhone(Scanner sc, HashMap<String, Phone> phoneManagement) {
		System.out.println("이름과 주소 그리고 전화번호를 입력해주세요.");// 1
		String name = sc.next();
		String address = sc.next();
		int number = sc.nextInt();
		if (phoneManagement.containsKey(name) == false) {
			phoneManagement.put(name, new Phone(name, address, number));
		} else {
			System.out.println("이미 있는 사람입니다.");
			return;
		}
	}

}
