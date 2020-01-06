package kr.or.yi.java_study_02.ch08;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedIOEx {
	public static void main(String[] args) {
		int c;
		try (FileReader fin = new FileReader("D:\\department.txt")) {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out), 5);
			while ((c = fin.read()) != -1) {
				out.write((char) c);
			}
			out.flush();//이거 정말 중요하다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
