package VideoDers;

import java.util.Scanner;

public class ders05 {

	public static void main(String[] args) {
		
		// kullanýcýdan 2 vize ve bir final notu alacaðýz
		// vizeler %30 ve final %40
		// ortalama 50'den yukarý ise geçti
		// 40 ve 50 arasýnda ise þartlý geçti
		// 40 altý ise kaldý olarak yazacaðýz
		
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
			System.out.println("Geçti");	
		} else if (ort>=40 && ort<50) {      //  "||" veya operatörü
			System.out.println("Þartlý Geçer");
		} else {	
			System.out.println("Kaldý");
		}
		
	}

}
