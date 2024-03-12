package T4_exception;

class Parent {
	
}
class Child extends Parent{
	
}
class Child2 extends Parent{
	
}
public class Exception3_Final {
	public static void main(String[] args) {
		System.out.println("작업 시작");
//		Child child = new Child();
		Parent child = new Child();
		Child ccc = (Child)child;
		System.out.println();
		
		Parent parent = new Parent();
		try {
			Child2 ccc2 = (Child2)parent;
			System.out.println("정상처리");
		} catch (ClassCastException e) {
//			e.printStackTrace();
			System.out.println("클래스 형변환 다운캐스팅 오류: "+e.getMessage());
		}
		try {
			String data = null;
			System.out.println(data);
			System.out.println(data + 100);
			System.out.println((String)data + 100);
			System.out.println(data.toString());
			System.out.println("정상처리");
		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println("널값체크: "+e.getMessage());
		} finally {	//트라이 캐치에서 예외 발생하건 말건 마지막에(finally) 실행~
			System.out.println("작업 끝");
		}
	}
}
