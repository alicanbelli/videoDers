package VideoDers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ders28 {

	public static void main(String[] args) {
		//Try-catch-finally
		/*
		try {
			int a = 19/0; //s�f�ra b�lme hatas�
		} catch (ArithmeticException e) {
			System.out.println("Hata :" + e.getMessage());
		} */
		
		try {
			int a,b;
			Scanner scan = new Scanner(System.in);
			System.out.println("a : ");
			a = scan.nextInt();
			System.out.println("b : ");
			b = scan.nextInt();
			System.out.println("a+b="+(a+b));
		} catch (InputMismatchException e) {
			System.out.println("Hata : T�r hatas�");			
		} finally {
			System.out.println("��lem tamamland�!");
		}
		

	}

}
