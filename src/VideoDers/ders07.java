package VideoDers;

import java.util.Scanner;

public class ders07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sayac,toplam;
		float ortalama;
		
		sayac=0;
		toplam=0;
		while(sayac<10){
			System.out.println(sayac +". sayýyý giriniz : ");
			toplam = toplam + scan.nextInt();
			sayac++;
		}
		
		ortalama = toplam/10;
		System.out.println("Ortalama = "+ortalama);

	}

}
