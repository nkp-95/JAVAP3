package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		//입력 문자에 따라 배분 정책 수행하기
		Scanner in = new Scanner(System.in);
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 적은 상담원 할당 방식");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		char ch = in.next().charAt(0);
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능 입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgedt();
		
		in.close();

	}

}
