package VideoDers;

import java.util.Scanner;

public class ders02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Bir Float say� giriniz:");
		a = scan.nextFloat();
		
		System.out.println("Bir Float say� daha giriniz:");
		b = scan.nextFloat();
		
		System.out.println(a+b);
		
		int c;
		
		System.out.println("Bir Integer say� daha giriniz:");
		c = scan.nextInt();
		System.out.println(c*c); 
		
		String isim;
		
		System.out.println("�sminizi giriniz:");
		isim = scan.next();
		
		System.out.println("merhaba " + isim);
		
	}

}
