package dataStructure;
/*
 1. everything must be written under a function
 2. the code can't run without a main class 
 3. 
 */

public class Array {
	public static int classNote(int[] array){
		//corner case
		if (array == null || array.length == 0) {
			return -1;
		}
		int a = 10;
		int sum = 0;
	//a[0,1,2,3,4,5]
		for (int i= 0; i < array.length; i++) {
			sum = a + array[i];
		
		}
		return sum;
	}
	public static void main(String arg[]) {
		int[] array = new int[] {1,2,3,5};
		int sum = classNote(array);
		System.out.print(sum);
	}
}




