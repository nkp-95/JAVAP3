package q7;

public class BubbleSort implements Sort {
	
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 입니다");
		
	}
	
}
