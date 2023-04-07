package study;

public class Util {

	  public static void selectionSort(int[] values) {
	      for (int i = 0; i < values.length; i++) {
	        int minIdx = i; 
	        for (int j = i+1; j < values.length; j++ ) {
	          //������� ã�� �ּҰ�(values[minIdx])�� 
	          //values[j]�� ���ؼ� values[j]�� �� ������
	          //minIdx�� j�� ���� : minIdx = j
	          if(values[minIdx] > values[j]) {
	              minIdx = j;
	          }
	        }
	        //minIdx�� ���� i�� ���� ��ȯ
	        swap(i, minIdx, values);
	      }
	  }

	  public static void selectionSort(Comparable[] values) {
	    for (int i = 0; i < values.length; i++) {
	      int minIdx = i; 
	      for (int j = i+1; j < values.length; j++ ) {
	        //������� ã�� �ּҰ�(values[minIdx])�� 
	        //values[j]�� ���ؼ� values[j]�� �� ������
	        //minIdx�� j�� ���� : minIdx = j
	        if (values[minIdx].compareTo(values[j]) > 0 ) {
	            minIdx = j;
	        }
	      }
	      //minIdx�� ���� i�� ���� ��ȯ
	      swap(i, minIdx, values);
	    }
	}

	  private static void swap(int idx1, int idx2, int[] values) {
	    int tmp = values[idx1];
	    values[idx1] = values[idx2];
	    values[idx2] = tmp;
	  }

	  private static void swap(int idx1, int idx2, Comparable[] values) {
	    Comparable tmp = values[idx1];
	    values[idx1] = values[idx2];
	    values[idx2] = tmp;
	  }
	  
	}
