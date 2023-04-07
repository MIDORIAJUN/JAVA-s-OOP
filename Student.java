package study;

public class Stud3 extends Comparable{
	  private String name;
	  private String stdNum;

	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getStdNum() {
	    return stdNum;
	  }
	  public void setStdNum(String stdNum) {
	    this.stdNum = stdNum;
	  }

	  public Stud3(String name, String stdNum) {
	    this.name = name;
	    this.stdNum = stdNum;
	  }

	  @Override
	  public String toString() {
	    return "[�̸�: " + name + ", �й�: " + stdNum+ "]";
	  }

	  @Override
	  public int compareTo(Comparable anotherVal) {
	    //�л���ü���� �̸� ������ ������ �� �ֵ��� �̸� �񱳸� ����. 
	    //���� ���� name��, anotherVal ��ü�� �̸��� ���ؼ�
	    //���ĺ� ������ �� �̸� ���̸� -1, �̸��� ������ 0, 
	    //�� �̸��� �ڸ� 1�� ��ȯ����. 
		  Stud3 std = (Stud3)anotherVal; // ���� ����ȯ. 
	    //String stdName = std.getName();
	    //String Ŭ������ �̹� compareTo �޼ҵ带 ������. 
	    //���ڷ� ���޵� ���ڿ��� ���� ���� ������ ���� 1, 0, -1�� ��ȯ�Ѵ�. 
	    //return name.compareTo(stdName);

	    //�й� ������ �����ϰ��� �Ѵٸ� 
	    String yourStdNum = std.getStdNum();
	    return stdNum.compareTo(yourStdNum);
	  }
	  
}
