package kr.or.yi.java_study_02.ch07.exam03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

import kr.or.yi.java_study_02.ch07.exam02.StdManagerInterface;
import kr.or.yi.java_study_02.ch07.exam02.Student;

public class StdMgnForHashMap implements StdManagerInterface {
	private HashMap<Integer, Student> stdMap;

	public StdMgnForHashMap() {
		this.stdMap = new HashMap<Integer, Student>();
	}

	@Override
	public boolean insertStudent(Student student) {
//		if (!stdMap.containsKey(student.getStdNo())) {
//			stdMap.put(student.getStdNo(), student);
//			return true;
//		}
//		return false;
		Student res = stdMap.put(student.getStdNo(), student);
		return res == null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		stdMap.remove(student.getStdNo());
		return false;
	}

	@Override
	public ArrayList<Student> listStudent() {
		ArrayList<Student> stdlist = new ArrayList<Student>();
		Set<Integer> keys = stdMap.keySet();
		for (Integer stdNo : keys) {
			stdlist.add(stdMap.get(stdNo));
		}
		return stdlist;
	}

	@Override
	public boolean updateStudent(Student student) {
		String jumsu = JOptionPane.showInputDialog("수정할 점수들을 적어주세요.(국어,수학,영어)");
		String[] korEngMath = jumsu.split(",");
		int kor = Integer.parseInt(korEngMath[0].trim());
		int math = Integer.parseInt(korEngMath[1].trim());
		int eng = Integer.parseInt(korEngMath[2].trim());
		String name = stdMap.get(student.getStdNo()).getStdName();
		stdMap.put(student.getStdNo(), (new Student(student.getStdNo(), name, kor, math, eng)));
		return false;
	}

	@Override
	public Student searchStudent(Student student) {
		return stdMap.get(student.getStdNo());
	}

	@Override
	public String toString() {
		return String.format("(%s)", stdMap);
	}
}
