package T2_nestedClass3;


public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 메인메소드입니다~\n");
		Test1 t1 = new Test1();
		System.out.println("Test1클래스의 su = "+t1.su+"\n");
		t1.modTest1();
		t1.modClass();
	}
}
