package T4_exception;

public class Exception4_MultiException3 {
	public static void main(String[] args) {
		try {
			String data0 = args[0];
			System.out.println(data0);
			String data1 = args[1];
			System.out.println(data1);
			String data2 = args[2];
			System.out.println(data2);
			int res = Integer.parseInt(data0) + Integer.parseInt(data2);
			System.out.println(res);
			System.out.println("정상처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 첨자변수 체크: "+e.getMessage());
		} catch (NumberFormatException e) {
		System.out.println("수치변수 체크: "+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("작업 끝.");
	}
}
