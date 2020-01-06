package kr.or.yi.java_study_02.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {
	public static void main(String[] args) {
		// exam01();

		img_copy("화면캡쳐.png", "화면캡쳐_copy.png");
	}

	private static void img_copy(String src, String dest) {
		String filePath = System.getProperty("user.dir") + "\\data\\";

		long start = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(filePath + src);
				FileOutputStream fos = new FileOutputStream(filePath + dest)) {
			byte[] buf = new byte[2048];
			while ((fis.read(buf)) != -1) {
				fos.write(buf);
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void exam01() {
		String filePath = System.getProperty("user.dir") + "\\data\\";

		try (FileOutputStream fout = new FileOutputStream(filePath + "test.out");) {
			byte b[] = { 7, 51, 3, 4, -1, 24 };
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream(filePath + "test.out");) {
			int c;
			while ((c = fis.read()) != -1) {
				System.out.println((char) c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
