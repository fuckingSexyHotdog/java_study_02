package kr.or.yi.java_study_02.ch07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExamMain {
 
	public static void main(String[] args) {
		/*
		1. 학생정보를 관리하는 프로그램을 작성하세요.
		2. 학생클래스를 정의(번호, 성명, 국어, 영어, 수학) 
		3. 학생관리클래스정의(StudentManagement) StdManagerInterface를 구현한
		4. 메뉴작성(1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생 검색,  6. 종료)
		*/
		Comparator<Student> stdComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStdNo()-o2.getStdNo();
			}
		};
		
		Comparator<Student> totalComp = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.total()-o1.total();
			}
		};
		
		ArrayList<Comparator<Student>> sortMethod = new ArrayList<Comparator<Student>>();
		sortMethod.add(stdComp);
		sortMethod.add(totalComp);
		
		StudentManagement sm = new StudentManagement();
		sm.setStudentList(initStdList());
		
		Scanner sc = new Scanner(System.in);
		int res;
		do {
			System.out.println("1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5. 학생검색, 6. 학번순, 7.총점순, 8. 종료");
			res = sc.nextInt();
			System.out.println(res);
			switch(res) {
			case 1:
				prnStudents(sm.listStudent());
				break;
			case 2:
				Student insertStd = getStudent();//추가할 학생정보
				sm.insertStudent(insertStd);
				break;
			case 3:
				System.out.println("3. 학생 수정");
				Student updateStudent = getUpdateStudent(sm);
				if (sm.updateStudent(updateStudent)) {
					JOptionPane.showMessageDialog(null, "수정하였습니다.");
				}
				break;
			case 4:
				System.out.println("4. 학생 삭제");
				Student delStudent = getFindStudentByStdNo("삭제할 학생 번호");
				if (sm.deleteStudent(delStudent)) {
					JOptionPane.showMessageDialog(null, "삭제하였습니다.");
				}
				break;
			case 5:
				Student seacrhStd = sm.searchStudent(getFindStudentByStdNo("검색할 학생 번호"));
				if (seacrhStd != null) {
					JOptionPane.showMessageDialog(null, seacrhStd, "학생 검색", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "해당 학생이 존재하지 않음", "학생 검색", JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 6:
				sortList(sm, sortMethod.get(0));
				break;
			case 7:
				sortList(sm, sortMethod.get(1));
				break;
			}
		}while(res < 8);
		System.out.println("학생관리 프로그램을 종료합니다.");
		sc.close();
	}

	private static void sortList(StudentManagement sm, Comparator<Student> comp) {
		ArrayList<Student> slist = sm.listStudent();
		slist.sort(comp);
		prnStudents(slist);
	}
	
	private static Student getFindStudentByStdNo(String msg) {
		String res = JOptionPane.showInputDialog(msg);
		int stdNo = Integer.parseInt(res.trim());
		return new Student(stdNo);
	}

	private static Student getUpdateStudent(StudentManagement sm) {
		Student findStd = getFindStudentByStdNo("수정할 학생 번호");
		if (findStd==null) {
			JOptionPane.showMessageDialog(null, "학생이 존재하지 않음");
			return null;
		}else {
			String res = JOptionPane.showInputDialog("학생정보 : 국어,영어,수학 ex) 90,90,90");
			String[] resArr = res.split(",");
			findStd.setKor(Integer.parseInt(resArr[0].trim()));
			findStd.setEng(Integer.parseInt(resArr[1].trim()));
			findStd.setMath(Integer.parseInt(resArr[2].trim()));
			return findStd;
		}
	}

	private static Student getStudent() {
		String res = JOptionPane.showInputDialog("학생정보 : 번호,성명,국어,영어,수학 ex)1,이상원,90,90,90");
		System.out.println(res);
		String[] resArr = res.split(",");
		
		int stdNo = Integer.parseInt(resArr[0].trim());
		String stdName = resArr[1].trim();
		int kor = Integer.parseInt(resArr[2].trim());
		int math = Integer.parseInt(resArr[3].trim());
		int eng = Integer.parseInt(resArr[4].trim());
		
		return new Student(stdNo, stdName, kor, math, eng);
	}

	private static void prnStudents(ArrayList<Student> listStudent) {
		for(Student std : listStudent) {
			System.out.println(std);
		}
	}

	private static ArrayList<Student> initStdList() {
		ArrayList<Student> arList = new ArrayList<>();
		Random rnd = new Random();
		String[] names = {"권수진", "정아름", "장현서", "황태원", 
				"배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		for(int i=0; i<names.length; i++) {
			arList.add(new Student(i+1, names[i], 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41, 
					rnd.nextInt(60)+41));
		}
		
		return arList;
	}

}
