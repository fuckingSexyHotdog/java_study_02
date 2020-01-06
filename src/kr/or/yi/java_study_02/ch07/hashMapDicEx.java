package kr.or.yi.java_study_02.ch07;

import java.util.HashMap;
import java.util.Scanner;

public class hashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		// HashMap 생성과 var dic = new HashMap<String, String>();로 간략하게 써도 됨

		// 3개의 (key, value) 쌍을 dic에 저장
		System.out.println(dic.put("baby", "아기"));
		System.out.println(dic.put("love", "사랑"));
		System.out.println(dic.put("apple", "사과"));
		System.out.println(dic.put("apple", "사과2"));
		
		System.out.println(dic);
//		// 사용자로부터 영어 단어를 입력받고 한글 단어 검색. "exit" 입력받으면 종료
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("찾고 싶은 단어는?");
//			String eng = sc.next();
//			if (eng.equals("exit")) {
//				System.out.println("종료합니다......");
//				break;
//			}
//			// HashMap에서 '키' eng의 '값' kor 검색
//			String kor = dic.get(eng);
//			if (kor == null) {
//				System.out.println(eng + "는 없는 단어 입니다.");
//			} else {
//				System.out.println(kor);
//			}
//		}
//		sc.close();
	}
}
