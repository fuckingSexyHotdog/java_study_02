package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;
import java.util.Comparator;

public class ObjectEquals {
	public static void main(String[] args) {
		Student[] stdArr = { new Student(5, "장현서", 80, 80, 70), new Student(3, "유경진", 81, 90, 70),
				new Student(4, "권수진", 82, 100, 70), new Student(1, "정아름", 83, 89, 70),
				new Student(2, "김민수", 84, 69, 70) };

//		do_search(stdArr);
//		do_sort(stdArr);
		
		prn_Object();

//		Student std01 = new Student(1, "이상원", 90, 90, 90);
//		Student std02 = new Student(1, "이상원", 90, 90, 90);
//		Student findStd = new Student(1);
//
//		if (std01.equals(std02)) {
//			System.out.println("같은 사람");
//		} else {
//			System.out.println("다른 사람");
//		}
//		if (std01.equals(findStd)) {
//			System.out.println("같은 사람");
//		} else {
//			System.out.println("다른 사람");
//		}
//
//		System.out.println("std01 : " + std01.hashCode());
//		System.out.println("std02 : " + std02.hashCode());
	}

	private static void prn_Object() {
		// TODO Auto-generated method stub
		
	}

	private static void do_search(Student[] stdArr) {
		// 검색
		Arrays.sort(stdArr);
		prnStds(stdArr);
		Student findStd = new Student(5);
		int findIdx = Arrays.binarySearch(stdArr, findStd);
		System.out.println(findStd + "의 위치는 " + findIdx);
	}

	private static void do_sort(Student[] stdArr) {
		// 학번순으로 정렬(기본정렬)
		prnStds(stdArr);
		Arrays.sort(stdArr);
		prnStds(stdArr);

		// 국어점수로 정렬
		Comparator<Student> korOrder = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getKor() - o1.getKor();
			}
		};

		Arrays.parallelSort(stdArr, korOrder);
		System.out.println("국어점수별 정렬");
		prnStds(stdArr);

		// 영어점수별로 정렬
		Comparator<Student> EngOrder = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getEng() - o1.getEng();
			}
		};

		Arrays.parallelSort(stdArr, EngOrder);
		System.out.println("영어점수별 정렬");
		prnStds(stdArr);
	}

	private static void prnStds(Student[] stdArr) {
		for (Student s : stdArr) {
			System.out.println(s);
		}

	}
}
