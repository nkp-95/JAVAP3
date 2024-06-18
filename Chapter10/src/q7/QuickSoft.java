package q7;

public class QuickSoft implements Sort {
	public void ascending(int[] arr) {
		System.out.println("quickSoft ascending");
	}
	public void descending(int[] arr) {
		System.out.println("quickSoft descending");
	}
	public void description() {
		Sort.super.description();
		System.out.println("quickSoft 입니다");

	}
}
