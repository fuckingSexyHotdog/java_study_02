package kr.or.yi.java_study_02.ch07.exam06;

import java.util.Scanner;
import java.util.Vector;

class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> num = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지) >>");
		int num2 = sc.nextInt();
		if(num2>0) {
			num.add(num2);
		}
	}
	
	
}
