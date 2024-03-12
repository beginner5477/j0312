package T2_nestedClass3;

//(이너)중첩클래스: 로컬클래스 
public class Test1 {
	int su = 500;
	
	public Test1() {
		System.out.println("이곳은 Test1클래스의 기본생성자입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드입니다.");
	}
	
	public void modClass() {
		int atom = 900;
		System.out.println("이곳은 Test1클래스의 modClass메소드입니다.");
		System.out.println("Test1클래스의 modClass메소드안의 atom변수 = "+atom);
		//로컬클래스는 자기가 포함된 메소드가 종료되거나 실행안되면 날아가므르 
		//public붙이면 외부에서 부른다는말이므로 모순이므로 에러
		//로컬클래스는 $붙고 "숫자"도 추가됨
		class Aa {
			//int su = 100; 사용가능함 서로 독립된 클래스라서
			int suA = 550;
			public Aa() {
				System.out.println("이곳은 로컬클래스 Aa클래스의 기본생성자입니다.");
			}
			public void modTest1A() {
				System.out.println("이곳은 로컬클래스 Aa클래스의 modTest1A메소드입니다.");
			}
			public void modTest1B() {
				System.out.println("이곳은 로컬클래스 Aa클래스의 modTest1B메소드입니다.");
			}
			
		}
		System.out.println();
		Aa aa = new Aa();
		System.out.println("로컬클래스안의 suA = "+aa.suA);
		aa.modTest1A();
		aa.modTest1B();
	}
	public void modClass2() {
		class Bb {
			
		}
	}
	public void modClass3() {
		class Aa {
			
		}
	}
}
class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스의 기본생성자입니다.");
	}
}