package kr.or.yi.java_study_02.ch06;

public class Student implements Comparable<Student> {
	private int stdNo;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student() {

	}

	public Student(int stdno) {
		this.stdNo = stdno;
	}

	public Student(int stdno, String name, int kor, int eng, int math) {
		this.stdNo = stdno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getStdno() {
		return stdNo;
	}

	public void setStdno(int stdno) {
		this.stdNo = stdno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s, %s, %s)", stdNo, name, kor, eng, math);
	}

	@Override
	public int hashCode() {
		return stdNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return stdNo == other.stdNo;
	}

	@Override
	public int compareTo(Student o) {
		return this.stdNo - o.stdNo;
	}

}
