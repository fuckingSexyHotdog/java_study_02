package kr.or.yi.java_study_02.ch06;

public class WrapperEx {
	public static void main(String[] args) {
//		transs();

		System.out.println(Character.toLowerCase('A'));// 'A'를 소문자로 변환

		char c1 = '4';
		char c2 = 'F';
		if (Character.isDigit(c1)) {// 문자 c1이 숫자이면 true
			System.out.println(c1 + "는 숫자");
		}

		if (Character.isAlphabetic(c2)) {// 문자 c2이 영문자이면 true
			System.out.println(c2 + "는 영문자");
		}
		
		System.out.println(Integer.parseInt("-123"));// "-123을 10진수로 변환"
		System.out.println(Integer.toHexString(28));// 정수 28을 2진수 문자열로 변환
		System.out.println(Integer.toBinaryString(28));// 정수 28을 16진수 문자열로 변환
		System.out.println(Integer.bitCount(28));// 정수 28에 대한 2진수의 1의 개수

		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());// Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14"));// 문자열을 실수 3.14로 변환

		boolean b = (4 > 3);// b는 true\
		System.out.println(Boolean.toString(b));// true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false"));// 문자열을 false로 변환

	}

	private static void transs() {
		Integer i = 31;// autoboxing
		Integer i2 = Integer.valueOf(31);
		Integer i3 = new Integer(31);
		Integer i4 = Integer.valueOf("31");

		System.out.printf("%d, %d, %d, %d%n", i, i2, i3, i4);

		System.out.println(Integer.bitCount(31));// 십진수 31를 이진수로 변환 후 1의 개수
		System.out.println(Integer.toHexString(31));// 십진수 31를 십육진수로 변환
		System.out.println(Integer.toBinaryString(31));// 십진수 31를 이진수로 변환
		System.out.println(Integer.toOctalString(31));// 십진수 31를 팔진수로 변환
		System.out.println(i2.floatValue());
		System.out.println(i3.doubleValue());

		String str = i3.toString();
		System.out.println(str);
	}
}
