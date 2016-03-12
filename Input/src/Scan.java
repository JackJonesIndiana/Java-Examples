import java.util.Scanner;

public class Scan {

	private Scanner mScanner;
	
	public static void main(String [] args){
		Scan sc = new Scan();
		sc.readAndShow();
	}

	public void readAndShow(){
		mScanner = new Scanner(System.in);
		System.out.println(mScanner.nextLine());
		mScanner.close();
	}
	
}
