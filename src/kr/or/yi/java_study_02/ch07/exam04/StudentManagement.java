package kr.or.yi.java_study_02.ch07.exam04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentManagement implements StdManagerInterface {
	private ArrayList<Student> stdList;

	public StudentManagement() {
		stdList = new ArrayList<Student>();
	}

	@Override
	public boolean insertStudent(Student student) {
		return stdList.add(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		if (stdList.contains(student)) {
			return stdList.remove(student);
		}
		return false;
	}
//	@Override
//	public boolean deleteStudent(Student student) {
//		int i = student.getStdNo();
//		System.out.println(stdList.get(i));
//		return stdList.remove(stdList.get(i));;
//	}

	@Override
	public ArrayList<Student> listStudent() {
		return this.stdList;
	}

	@Override
	public boolean updateStudent(Student student) {
		Student std = stdList.set(stdList.indexOf(student), student);
		return std != null;
	}
//	@Override
//	public boolean updateStudent(Student student) {
//		String res = JOptionPane.showInputDialog("수정할 과목을 골라주세요. (국어 :1, 영어:2, 수학:3)");
//		res = res.trim();
//		String[] resArr = new String[1];
//		resArr[0] = res.trim();
//		String res2 = JOptionPane.showInputDialog("점수를 적어주세요");
//		res2 = res2.trim();
//		String[] resArr2 = new String[1];
//		resArr2[0] = res2.trim();
//		int j = Integer.parseInt(resArr2[0]);
//		int i = student.getStdNo();
//		System.out.println(stdList.get(i));
//		switch (res) {
//		case "1": {
//			stdList.get(i).setKor(j);
//			break;
//		}
//		case "2": {
//			stdList.get(i).setEng(j);
//			break;
//		}
//		case "3": {
//			stdList.get(i).setMath(j);
//			break;
//		}
//		default:
//			break;
//		}
//		System.out.println(stdList.get(i));
//		return false;
//	}

	@Override
	public Student searchStudent(Student student) {
		if (!stdList.contains(student)) {
			return null;
		}
		return stdList.get(stdList.indexOf(student));
	}
//	@Override
//	public Student searchStudent(Student student) {
//		int i = student.getStdNo();
//		System.out.println(stdList.get(i));
//		return stdList.get(i);
//	}

	public void setStudentList(ArrayList<Student> initStdList) {
		this.stdList = initStdList;
	}

}
