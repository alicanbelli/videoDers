package VideoDers;

import java.util.Scanner;

public class ders06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int islem;
		
		System.out.println("Bir say� giriniz:");
		a=scan.nextInt();
		System.out.println("Bir say� daha giriniz:");
		b=scan.nextInt();

		System.out.println("Toplama 1");
		System.out.println("��karma 2");
		System.out.println("�arpma 3");
		System.out.println("B�lme 4");
		System.out.println("Secim yap�n�z");
		islem = scan.nextInt();
		
		switch (islem) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("1-4 aras� i�lem se�iniz");
			break;
		}
		
		
	}

}
