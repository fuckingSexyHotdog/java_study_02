package kr.or.yi.java_study_02.ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayListEx {
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
//		addList(arList);
		arList.add(5);// index = 0;
		arList.add(3);// index = 1;
		arList.add(4);// index = 2;
		arList.add(1);// index = 3;
		for (int i = 0; i < arList.size(); i++) {
			System.out.println(arList.get(i));
		}

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("이상원");
		strList.add("황태원");
		strList.add("권수진");
		strList.add("이상원");
		for (String name : strList) {
			System.out.println(name);
		}
		if (strList.contains("황태원")) {
			System.out.println("포함");
		} else {
			System.out.println("미포함");
		}

		int findIdx = strList.lastIndexOf("이상원");
		System.out.println(findIdx);

		System.out.println(strList.isEmpty());

		strList.remove("권수진");
		System.out.println(strList);

		String[] a = new String[strList.size()];
		System.out.println(Arrays.toString(a));
		strList.toArray(a);
		System.out.println(Arrays.toString(a));

		strList.clear();
		System.out.println(strList.isEmpty());
		System.out.println(strList);

	}

	private static void addList(List<Integer> arList) {
		System.out.println(arList);
		System.out.println("arList.size() : " + arList.size());

		arList.add(5);
		System.out.println("arList.size() : " + arList.size());
		for (int i = 0; i < 10; i++) {
			arList.add(i);
		}
		System.out.println("arList.size() : " + arList.size());
		System.out.println(arList);

		arList.add(1, 10);
		System.out.println(arList);

		ArrayList<Integer> subList = new ArrayList<Integer>();
		subList.add(20);
		subList.add(21);
		subList.add(22);

		arList.addAll(subList);
		System.out.println(subList);
	}
}
