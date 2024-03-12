package T4_exception;

public class Exception1_interrupt {
	public static void main(String[] args) {
		System.out.print("금주의 로또 번호는: ");
		for(int i = 0; i < 6; i++)
		{
			int rand = (int)(Math.random()*45) + 1;
			System.out.print(rand);
			try { Thread.sleep(1000); } catch (InterruptedException e) {e.printStackTrace();}
			System.out.print("...");
		}
	}
}
