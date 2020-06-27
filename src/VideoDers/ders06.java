package VideoDers;

import java.util.Scanner;

public class ders06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int islem;
		
		System.out.println("Bir sayý giriniz:");
		a=scan.nextInt();
		System.out.println("Bir sayý daha giriniz:");
		b=scan.nextInt();

		System.out.println("Toplama 1");
		System.out.println("Çýkarma 2");
		System.out.println("Çarpma 3");
		System.out.println("Bölme 4");
		System.out.println("Secim yapýnýz");
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
			System.out.println("1-4 arasý iþlem seçiniz");
			break;
		}
		
		
	}

}
