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
class Student222 implements Comparable{   //implements 인터페이스 선정
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
		
		//===================================================================== 
		Car_im cm = new Car_im("도요타","수프라",300,8000);
		Car_im cm2 = new Car_im("스바루","wrx sti",250,4000);
		Car_im cm3 = new Car_im();
		System.out.println(cm3);    //[브랜드:unknown,모델:unknown,speed:0,price:0]
		findLarger(cm,cm2);
		
		//=====================================================================
		Student222[] stds = new Student222[5];
		Student222 std1_1 = new Student222("일지매","컴정");
		stds[0] = std1_1;
		Student222 std2_1 = new Student222("홍길동","컴정");
		stds[1] = std2_1;
		Student222 std3 = new Student222("김타타","컴정");
		stds[2] = std3;
		Student222 std4 = new Student222("김철수","컴정");
		stds[3] = std4;
		Student222 std5 = new Student222("일지매","컴정");
		stds[4] = std5;
		
		//polymorphism.Util.selectionSort(stds);
		Util.selectionSort(stds);
		
		for(Student222 std : stds) {
			System.out.println(std.getName());
		}//for
		
		//Car_im[] cars = new Car_im[5];
		Comparable[] cars = new Car_im[5];  //가능
		Car_im c1 = new Car_im("스즈키","s1",170,3000);
		cars[0] = c1;
		Car_im c2 = new Car_im("마쓰다","mx-5",200,2500);
		cars[1] = c2;
		Car_im c3 = new Car_im("도요타","gr86",250,3000);
		cars[2] = c3;
		Car_im c4 = new Car_im("닛산","370z",250,3000);
		cars[3] = c4;
		Car_im c5 = new Car_im("혼다","시빅",250,3000);
		cars[4] = c5;
		
		Util.selectionSort(cars);
		
		for(Car_im car : (Car_im[])cars) {
			System.out.println(car);
		}//for
		
		Util.selectionSort(cars);
		//=====================================================================
	}
	
//	public static void findLarger2(Comparable cc1, Comparable cc2) {
//		if(cc1.compareTo(cc2) == 0) {
//			System.out.println("같음");
//		}else if(cc1.compareTo(cc2) > 0) {
//			System.out.println("첫번째가 크다");
//		}else {
//			System.out.println("두번째가 크다");
//		}
//	}
	//========================================================================
	
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
//========================================================
class Car_im implements Comparable{
	private String brand;
	private String model;
	private int speed;
	private int price;
	
	//==================================
	Car_im(){
//		this.brand = "Unknown";
//		this.model = "Unknown";
//		this.speed = 0;
//		this.price = 0;
		//더 편한 방법
		this("Unknown","Unknown",0,0); //밑의 Car_im(String brand,String model,int speed,int price) 생성자 소환
	}
	
	//cm3 출력
	public String toString() {
		return "[브랜드:" + brand + "모델:" + model + "speed:" + speed + "price:" + price + "]";
	}
	//==================================
	
	Car_im(String brand,String model,int speed,int price){
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.price = price;
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int compareTo(Comparable obj) {
		//차의 가격 비교를 하려면, Car 클래스의
		//getPrice 메소드를 호출해야되니, 부득이
		//Comparable 타입으로 받는 인자를
		//Car타입으로 하향 형변환
		//물론 이 obj 객체는 Car 클래스 타입의 객체이어야만 하고, 그렇다고 가정한다.
		Car_im cim = (Car_im)obj;
		//내차 가격과 인자로 전달된 차의 가격을 비교
		int aPrice = cim.getPrice();
		
		if(price == aPrice) {
			return 0;
		}else if (price > aPrice) {
			return 1;
		}else {
			return -1;
		}

	}
}
//==============================================================================

class Util {

	  public static void selectionSort(int[] values) {
	      for (int i = 0; i < values.length; i++) {
	        int minIdx = i; 
	        for (int j = i+1; j < values.length; j++ ) {
	          //현재까지 찾은 최소값(values[minIdx])과 
	          //values[j]를 비교해서 values[j]가 더 작으면
	          //minIdx를 j로 설정 : minIdx = j
	          if(values[minIdx] > values[j]) {
	              minIdx = j;
	          }
	        }
	        //minIdx의 값과 i의 값을 교환
	        swap(i, minIdx, values);
	      }
	  }

	  public static void selectionSort(Comparable[] values) {
	    for (int i = 0; i < values.length; i++) {
	      int minIdx = i; 
	      for (int j = i+1; j < values.length; j++ ) {
	        //현재까지 찾은 최소값(values[minIdx])과 
	        //values[j]를 비교해서 values[j]가 더 작으면
	        //minIdx를 j로 설정 : minIdx = j
	        if (values[minIdx].compareTo(values[j]) > 0 ) {
	            minIdx = j;
	        }
	      }
	      //minIdx의 값과 i의 값을 교환
	      swap(i, minIdx, values);
	    }
	}
	  //private static void selectionSort(int idx1, int idx2, int[] values) {
	  private static void swap(int idx1, int idx2, int[] values) {
	    int tmp = values[idx1];
	    values[idx1] = values[idx2];
	    values[idx2] = tmp;
	  }

	  private static void swap(int idx1, int idx2, Comparable[] values) { //(int idx1, int idx2, interfacetest,Comparable[] values)
	    Comparable tmp = values[idx1];
	    values[idx1] = values[idx2];
	    values[idx2] = tmp;
	  }
	  
}