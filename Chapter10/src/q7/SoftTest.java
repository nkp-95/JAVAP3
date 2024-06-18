package q7;

import java.util.Scanner;

public class SoftTest {

	public static void main(String[] args) {
		//메인 실행 코드가 다음과 같을때 인터페이스와 클래스를 완성하세요
		System.out.println("정렬 방식을 선택 하세요.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSoft");
		System.out.println("Q: QuickSoft");
		Scanner in = new Scanner(System.in);
		char ch = in.next().charAt(0);
		//인터페이스 타입의 참조변수
		Sort sort = null;
		if(ch == 'B' || ch =='b') {
			sort = new BubbleSort();
		}else if(ch == 'H' || ch =='h') {
			sort = new HeapSoft();
		}else if(ch == 'Q' || ch =='q') {
			sort = new QuickSoft();
		}
		//정렬방식과 상관없이 Sort 선언된 메서드 호출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();   //Sort.super.description
		
		
		in.close();

	}

}
