package study;

public class SafeArray {
	private int[] a;
	
	public void createArray(int size) {
		a = new int[size];
	}
	
	public int get(int index) {
		if(index >= 0 && index < a.length)
			return a[index];
		System.out.println("잘못된 인덱스" + index);
		return -1; //없다는 의미
	}
	
	public void put(int index, int value) {
		if(index >= 0 && index < a.length) {
			a[index] = value;
			return;
		}else {
		    System.out.println("잘못된 인덱스" + index);
		}
	}
	
	
	public static void main(String[] args) {
		SafeArray array = new SafeArray();
		array.createArray(10);
		
		array.put(2,100);
		array.put(10,200);
		
		System.out.println(array.get(2));

	}

}

//public class Test {
//
//	public static void main(String[] args) {
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}//for
//		
//		System.out.println("프로그램을 종료합니다");
//	}
//
//}
