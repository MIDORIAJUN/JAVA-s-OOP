package study;

public class Student {
	private int number;
	private String name;
	private int age;
	
	Student(){  //1번 생성자
		number = 100;
		name = "New Student";
		age =18;
	}
	
	Student(int number,String name,int age){ //2번 생성자
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Student [number=" + number + ",name=" + name + ", age=" + age + "]";
	}
//	public static void main(String[] args) {
//
//	}

}
