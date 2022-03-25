
package dataStructure;

public class MyArraryList{
	private int[] vals;
	private int capacity = 4;
	private int idx= 0;//exclusive 
	
	public MyArraryList() {
		this.vals = new int[this.capacity];
		
	}
	public int size() {
		return this.idx;
	}
	
	public void add(int val) {
		if (this.idx == this.capacity) {
			this.doubleSize();
			
		}
		this.vals[idx++] = val;
		
	}
	public int get(int index) {
		this.validateIndex(index);
		return this.vals[index];
		
	}
	public void insert(int index, int val) {
		this.validateIndex(index);
		if (this.idx == this.capacity) {
			this.doubleSize();
		}
		this.idx++;
		int tmp = val;
		for (int i = index; i<this.idx; i++) {
			int tVal = this.vals[i];
			this.vals[i] = tmp;
			tmp = tVal;
		}
	}
	
	public void remove(int index) {
		this.validateIndex(index);
		for(int i = index; i < this.idx; i++) {
			this.vals[i] = this.vals[i+1];
		}
		this.idx--;
	}
	public void print() {}
		//print whole arraylist contents
	private void validateIndex(int index) {
		if (index < 0 || index >= this.idx) {
			throw new RuntimeException("out of boundary");
		}
	}
	private void doubleSize() {
		int[] newVals = new int[this.capacity*2];
		for (int i = 0; i< this.idx; i++) {
			newVals[i] = this.vals[i];
		}
		this.vals = newVals;
		this.capacity *= 2;
	}
	
@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i< this.idx; i++) {
			sb.append((this.vals[i] + ","));
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		MyArraryList list = new MyArraryList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.insert(1, 14);
		System.out.println(list);
		System.out.println(list.get(4));
		list.remove(3);
		System.out.println(list);
		list.insert(0, 100);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
	}
}
