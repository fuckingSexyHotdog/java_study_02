package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import kr.or.yi.java_study_02.ch07.exam02.Student;

public class ExamMain {

	public static void main(String[] args) {
		StdMgnForHashMap sm = new StdMgnForHashMap();

		for (Student std : initStdList()) {
			sm.insertStudent(std);
		}

		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 종료");
			res = sc.nextInt();
			System.out.println(res);
			switch (res) {
			case 1:
				System.out.printf("%s%n", "학생목록");
				prnStudents(sm.listStudent());
				break;
			case 2:
				System.out.printf("%s%n", "학생추가");
				sm.insertStudent(insertStd(sm, sc));
				break;
			case 3:
				System.out.printf("%s%n", "학생 수정");
				sm.updateStudent(searchStd(sm, sc));
				break;
			case 4:
				System.out.printf("%s%n", "학생 삭제");
				sm.deleteStudent(searchStd(sm, sc));
				break;
			case 5:
				System.out.printf("%s%n", "학생 검색");
				System.out.println(sm.searchStudent(searchStd(sm, sc)));
				break;

			}
		} while (res < 6);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}

	private static Student searchStd(StdMgnForHashMap sm, Scanner sc) {
		System.out.println("검색할 학생의 번호를 입력하세요.");
		int stdNo = sc.nextInt();
		return new Student(stdNo);
	}

	private static Student insertStd(StdMgnForHashMap sm, Scanner sc) {
		System.out.println("추가할 학생의 번호와 이름, 국어, 영어 그리고 수학 점수를 적어주세요.");
		int stdNo = sc.nextInt();
		String stdName = sc.next();
		int stdKor = sc.nextInt();
		int stdEng = sc.nextInt();
		int stdMath = sc.nextInt();
		return new Student(stdNo, stdName, stdKor, stdEng, stdMath);
	}

	private static void prnStudents(ArrayList<Student> listStudent) {
		for (Student std : listStudent) {
			System.out.println(std);
		}
	}

	private static ArrayList<Student> initStdList() {
		ArrayList<Student> arList = new ArrayList<>();
		Random rnd = new Random();
		String[] names = { "권수진", "정아름", "장현서", "황태원", "배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선" };
		for (int i = 0; i < names.length; i++) {
			arList.add(new Student(i + 1, names[i], rnd.nextInt(60) + 41, rnd.nextInt(60) + 41, rnd.nextInt(60) + 41));
		}
		return arList;
	}

}
