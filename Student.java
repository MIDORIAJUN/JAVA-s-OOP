package study;

import java.time.LocalDate;

public class Student {
	private String name;
	private int birthYear;
	
	public void setName(String name) { //메소드
		this.name = name;
	}
	
	public void setBirthYear(int BirthYear) {
		if(birthYear >= 1900) {
			this.birthYear = BirthYear;
			return;
		}//if
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		LocalDate d = LocalDate.now();
		int year = d.getYear();
		return (year - birthYear);
	}
}
