package T4_exception;

//실행예외(Runtime exception)
public class Exception2_NullPointer {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("o = "+str.charAt(2));
		try {
			System.out.println(str2.charAt(2));
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("예외처리");
			System.out.println("널값 체크: "+e.getMessage());
		}
		System.out.println("작업끝.");
	}
}
