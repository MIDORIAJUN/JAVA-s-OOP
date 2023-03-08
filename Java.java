package study;


public class Java {
	private String name;

	  void setName(String argName) {
	    this.name = argName;
	  }

	  String getName() {
	    return name; // this.name
	  }

	  // member method
	  // instance method
	  double square(double df) {
	    test();
	    return df * df;
	  }

	  int square(int num) {
	    return num * num;
	  }

	  void test() {
	    System.out.println("test method called");
	  }

	public static void main(String[] args) {
		Java t = new Java();
	    t.name = "HongGilDong";
	    System.out.println(t.name);

	    Java t2 = new Java();
	    t2.name = "Kim";
	    System.out.println(t2.name);

	}

}
