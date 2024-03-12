package T2_nestedClass2;


public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run클래스의 main메소드입니다.");
		Test1 t1 = new Test1();
		System.out.println("t1.su = "+t1.su);
		t1.modTest1();
		System.out.println();
		new Aa();	//외부(일반)클래스 부른거
		Test1.Aa t1a = new Test1.Aa();	// (중첩)정적멤버클래스 부른거
		System.out.println("t1a.suA = "+t1a.suB);
		t1a.modTest1A();
		t1a.modTest1B(); // 메소드영역에 스태틱으로 올려놓고 왜 객체생성해서 불필요하게 쓰냐?
		System.out.println();
		
		System.out.println(Test1.Aa.suB);
		Test1.Aa.modTest1B();
	}
}
