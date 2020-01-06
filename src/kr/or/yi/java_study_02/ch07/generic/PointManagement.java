package kr.or.yi.java_study_02.ch07.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PointManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> pointSet = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");

		while (true) {
			System.out.print("이름과 포인트 입력  >> ");
			String name = sc.next();
			int point = sc.nextInt();
			if (name.equals("그만")) {
				break;
			}
			if (pointSet.containsKey(name) == false) {
				pointSet.put(name, point);
			} else {
				int temp = pointSet.get(name);
				pointSet.put(name, point + temp);
			}
			Set<String> keys = pointSet.keySet();
			Iterator<String> it = keys.iterator();
			while (it.hasNext()) {
				String key = it.next();
				Integer value = pointSet.get(key);
				System.out.print("(" + key + ", " + value + ")");
			}
			System.out.println("");
		}
		System.out.println("종료!!");
		sc.close();
	}
}
