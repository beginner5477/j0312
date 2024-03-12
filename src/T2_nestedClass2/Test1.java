package T2_nestedClass2;

//(이너)중첩클래스: 정적멤버클래스 
public class Test1 {
	int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스의 기본생성자입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드입니다.");
	}
	
	//중첩클래스는 bin파일에 들어가보면 $로 구분시켜준다 가보세용.
	public static class Aa {
		//int su = 100; 사용가능함 서로 독립된 클래스라서
		int suA = 400;
		static int suB = 450;
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스의 기본생성자입니다.");
		}
		public void modTest1A() {
			System.out.println("이곳은 중첩클래스 Aa클래스의 modTest1A메소드입니다.");
		}
		public static void modTest1B() {
			System.out.println("이곳은 중첩클래스 Aa클래스의 modTest1B메소드입니다.");
		}
		
	}
}
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스의 기본생성자입니다.");
	}
}