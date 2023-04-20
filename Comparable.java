package study;

public interface Comparable {
	//기본적으로 인터페이스에는 추상메소드만 존재한다.
	//하지만 jdk 8 이후에는 추상 메소드 이외에도
	//메소드 바디를 다지는 디폴트 메소드도 정의할 수 있다.
	//인터페이스의 모든 메소드는 기본적으로 public 이다.
	//왜냐하면 다른 클래스와 상호작용하기 위한 계약이기 때문에
	//다른 클래스에서 사용할 수 있는 메소드의 리스트를 나열하는 것이다.
	int compareTo(Comparable obj);

}
//Student 클래스는 comparable 인터페이스의 모든 메소드를 구현해야 한다.
class Student222 implements Comparable{
	private String name;
	private String dept;
	
	public String getName() {
		return name;
	}
	
	public Student222(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public int compareTo(Comparable obj) {
	//null인 경우는 없다고 가정
	//interface는 class처럼 데이터 타입으로 사용될 수 있다.
	//특정 interface 타입의 변수는 그 interface를 구현하는
	//모든 클래스(와 그 클래스의 모든 후손 클래스)의 객체를 담을 수 있다.
	Student222 std = (Student222)obj;
	// String 클래스는 java.lang 페키지의 Comparable 인터페이스를
	//이미 구현하고 있다. 즉, 그 인터페이스의 추상 메소드인
	//compareTo 메소드를 구현하고 있다.
	//String의 compareTo 메소드는 비교 대상보다
	//사전 순서상 앞에 위치하면 -1, 같으면 0, 뒤에 위치하면 1을 반환한다.
	return name.compareTo(std.getName());
	
	}
	
}

class Test{
	public static void main(String[] args) {
//		String s1 = "bbc";
//		String s2 = "abc";
//		System.out.println(s1.compareTo(s2));
		Student222 std1 = new Student222("일지매","컴정");
		Student222 std2 = new Student222("홍길동","컴정");
		findLarger(std1,std2);
		
	}
	
	public static void findLarger(Comparable c1, Comparable c2) {
		if(c1.compareTo(c2) == 0) {
			System.out.println("같음");
		}else if (c1.compareTo(c2) > 0) {
			System.out.println("첫번째가 크다");
		}else {
			System.out.println("두번째가 크다");
		}//else
	}
}