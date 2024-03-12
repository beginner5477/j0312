package T4_exception;

public class Exception1_classNotFound {
	public static void main(String[] args) {
		//java.lang.Object
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang패키지에는 Object2클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("java.lang패키지에는 Object2클래스가 없습니다.: "+ e.getMessage());
		}
		System.out.println("작업끝...");
	}
}
