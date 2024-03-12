package T4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4_MultiException4 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.Object");
			System.out.println("java.lang패키지 아래에 Object클래스가 있습니다.");
			FileInputStream is = new FileInputStream("test.txt");
			System.out.println("찾는파일이 존재합니다.");
			System.out.println("잠시 쉬었다가 갑니다.");
			Thread.sleep(1000);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일 확인하세요.");
		} catch (FileNotFoundException e) {
			System.out.println("파일 확인하세요.");
		} catch (InterruptedException e) {
			System.out.println("스레드 확인하세요.");
		} finally {
			System.out.println("작업 끝.");
		}
	}
}
