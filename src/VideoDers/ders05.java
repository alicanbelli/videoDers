package VideoDers;

import java.util.Scanner;

public class ders05 {

	public static void main(String[] args) {
		
		// kullan�c�dan 2 vize ve bir final notu alaca��z
		// vizeler %30 ve final %40
		// ortalama 50'den yukar� ise ge�ti
		// 40 ve 50 aras�nda ise �artl� ge�ti
		// 40 alt� ise kald� olarak yazaca��z
		
		Scanner scan = new Scanner(System.in);
		
		int v1,v2,f;
		float ort;
		
		System.out.println("Vize 1 notunu giriniz : ");
		v1 = scan.nextInt();
		
		System.out.println("Vize 2 notunu giriniz : ");
		v2 = scan.nextInt();
		
		System.out.println("Final notunu giriniz : ");
		f = scan.nextInt();
		
		ort = (float) (v1*0.3 + v2*0.3 + f*0.4);
		
		System.out.println("Ortalama " + ort);
		
		if(ort>=50){
			System.out.println("Ge�ti");	
		} else if (ort>=40 && ort<50) {      //  "||" veya operat�r�
			System.out.println("�artl� Ge�er");
		} else {	
			System.out.println("Kald�");
		}
		
	}

}
