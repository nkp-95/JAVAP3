package finalex;

//열거형(자료형) 데이터타입
enum DayType{
	SUN, MON, TUE, WED, THU, FRI, SAT,
}

public class UsingDefine {
	private DayType datatype; //enum DayType에 있는것만 사용 가능
	
	public UsingDefine(DayType dType) {
		this.datatype = dType;
	}
	

	public static void main(String[] args) {
		//상수클래스 사용하기
		System.out.println(Define.GOOD_MORNING);  //정적인 클래스는 new 없이 직접 접근 가능
		System.out.println("최소값: " + Define.MIN);
		System.out.println("최대값: " + Define.MAX);
		System.out.println("수학 코드는: " + Define.MATH);
		System.out.println("영어 코드는: " + Define.ENG);
		
		System.out.println(DayType.THU);  //Thursday
		
		//UsingDefine ud = new UsingDefine("Thursday");  //불가능
		UsingDefine ud = new UsingDefine(DayType.THU);  //가능
	}

}
