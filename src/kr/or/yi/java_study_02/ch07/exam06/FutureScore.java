package kr.or.yi.java_study_02.ch07.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FutureScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> futureScore = new HashMap<String, Double>();
		System.out.println("미래장학금관리시스템입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();
			Double score = sc.nextDouble();
			futureScore.put(name, score);
		}
		System.out.println("장학생 선발 학점 기준 입력 >> ");
		double choice = sc.nextDouble();
		System.out.print("장학생 명단 : ");
		Set<String> keys = futureScore.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Double value = futureScore.get(key);
			if (value > choice) {
				System.out.print(key + " ");
			}
		}
		sc.close();
	}
}
