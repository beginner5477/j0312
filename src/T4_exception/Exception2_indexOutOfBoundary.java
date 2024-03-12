package T4_exception;

//실행예외(Runtime exception)
public class Exception2_indexOutOfBoundary {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		for(int i = 0; i <= arr.length; i++)
		{
			try {
				System.out.println(arr[i]);
				System.out.println("정상처리됨.");
			} catch (ArrayIndexOutOfBoundsException e) {
//				e.printStackTrace();
				System.out.println("첨자변수오류: "+e.getMessage());
			}
		}
		System.out.println("작업끝.");
	}
}
