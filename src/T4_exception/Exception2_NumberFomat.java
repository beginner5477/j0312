package T4_exception;

//실행예외(Runtime exception)
public class Exception2_NumberFomat {
	public static void main(String[] args) {
		String strNumber = "100a";
		System.out.println(strNumber + 10);
		try {
			int num = Integer.parseInt(strNumber);
			System.out.println("정상처리");
			System.out.println(num + 10);
		} catch (NumberFormatException e) {
			System.out.println("예외처리");
//			e.printStackTrace();
			System.out.println("숫자변환오류: "+e.getMessage());
		}
		System.out.println("작업끝.");
	}
}
