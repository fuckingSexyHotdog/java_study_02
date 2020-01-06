package kr.or.yi.java_study_02.ch07.exam05;

class Phone2 extends PhoneManagement {
	private String name;
	private String address;
	private int number;

	public Phone2() {
		// TODO Auto-generated constructor stub
	}

	public Phone2(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Phone2 [name=%s, address=%s, number=%s]", name, address, number);
	}
}
