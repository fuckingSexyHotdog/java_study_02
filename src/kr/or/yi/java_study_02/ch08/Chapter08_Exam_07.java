package kr.or.yi.java_study_02.ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter08_Exam_07 {
	public static void main(String[] args) {

		file_copy("angle.jpg", "angle2.jpg");
	}

	private static void file_copy(String copied, String copyObj) {
		System.out.println("angle.jpg를 angle2.jpg로 복사합니다.");
		System.out.println("10%마다 *을 출력합니다.");
		String a2 = System.getProperty("user.dir") + "\\data\\";

		try (FileInputStream an = new FileInputStream(a2 + copied);
				FileOutputStream ang = new FileOutputStream(a2 + copyObj)) {
			String b = (an.toString().trim());
			
//			int c = Integer.parseInt(b);
			int i = 1;
			byte[] buf = new byte[1024];

			while ((an.read(buf)) != -1) {
//				System.out.print("*");
				ang.write(buf);
				i++;
			}
			System.out.println("복사 완료");
			System.out.println(b);
//			System.out.println(c);
			System.out.println(i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
