package kr.or.yi.java_study_02.ch06;

import java.util.Arrays;

class Product {
	private String code;
	private String name;
	public Product() {
	}
	public Product(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("(%s, %s)", code, name);
	}
}
class Sale {
	private int no;
	private String code;
	private int price;
	private int saleCnt;
	private int marginRate;
	public Sale() {
	}
	public Sale(int no, String code, int price, int saleCnt, int marginRate) {
		this.no = no;
		this.code = code;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSaleCnt() {
		return saleCnt;
	}
	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}
	public int getMarginRate() {
		return marginRate;
	}
	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}
	@Override
	public String toString() {
		return String.format("(%s, %s, %s, %s, %s)", no, code, price, saleCnt,
				marginRate);
	}
}
public class Exam {
	public static void main(String[] args) {
		exam01();
	}
	private static void exam01() {
		String[] productArr = {
				"A001,아메리카노", //code, name Product p = new Product(code, name)
				"A002,카푸치노", 
				"A003,헤이즐넛",
				"A004,에스프레소",
				"B001,딸기쉐이크",
				"B002,후르츠와인",
				"B003,팥빙수", 
				"B004,아이스초코"};	
		String[] saleArr = {
				"1,A001,4500,150,10", //no, code, price, saleCnt, marginRate
				"2,A002,3800,140,15", 
				"3,B001,5200,250,12", 
				"4,B001,4300,110,11",
				};
		//위의 문장을 이용하여 Product클래스와 Sale클래스를 정의하고 
		//Product[] pdtArrs와 Sale[] saleArrs로 변경하시오.
		Product[] pdtArrs = convert_to_Product(productArr);		
		Sale[] saleArrs = convert_to_Sale(saleArr);
	}
	private static Sale[] convert_to_Sale(String[] saleArr) {
		Sale[] sales = new Sale[saleArr.length];
		System.out.println("세일정보!!!");
		for(int i=0;i<sales.length;i++) {
			String [] saleArr2 = saleArr[i].split(",");
			sales[i] = new Sale(
						Integer.parseInt(saleArr2[0].trim()),
						saleArr2[1].trim(),
						Integer.parseInt(saleArr2[2].trim()),
						Integer.parseInt(saleArr2[3].trim()),
						Integer.parseInt(saleArr2[4].trim())
					);
			System.out.println(sales[i]);
		}
		return sales;
	}
	private static Product[] convert_to_Product(String[] productArr) {
		Product[] pdt = new Product[productArr.length];
		System.out.println("제품정보!!!");
		for(int i=0;i<pdt.length;i++) {
			String[] produtArr2 = productArr[i].split(",");
			pdt[i] = new Product(
						produtArr2[0].trim(),
						produtArr2[1].trim()
					);
			System.out.println(pdt[i]);
		}
		return pdt;
	}
}
