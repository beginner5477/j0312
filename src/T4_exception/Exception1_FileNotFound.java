package T4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotFound {
	public static void main(String[] args) {
			try {
				FileInputStream is = new FileInputStream("test.txt");
				System.out.println("test.txt파일이 존재합니다");
			} catch (FileNotFoundException e) {
				System.out.println("test.txt파일이 없습니다");
				e.printStackTrace();
			}
			System.out.println("작업끝.");
	}
}
