package study;

public class Test3 {
	  public static void main(String[] args) {
		  Stud3[] stds = new Stud3[5];
	    stds[0] = new Stud3("������", "2201363");
	    stds[1] = new Stud3("������", "2201392");
	    stds[2] = new Stud3("���ϰ�", "2201330");
	    stds[3] = new Stud3("������", "1801295");
	    stds[4] = new Stud3("������", "1901276");
	    
	    Util.selectionSort(stds);

	    for (Stud3 std: stds) {
	      System.out.println(std);
	    }
	  }
}

