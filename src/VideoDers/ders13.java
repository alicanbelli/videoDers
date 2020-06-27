package VideoDers;

import java.util.Scanner;

public class ders13 {
	
	public static int kacadet(String metin, char harf){
		int uzunluk,sayac,i;
		
		uzunluk = metin.length();
		sayac = 0;
		for(i=0;i<uzunluk;i++){
			if(metin.charAt(i)==harf) sayac++;		
		}
		
		return sayac;
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String metin;
		char harf;
		
		System.out.println("Bir metin giriniz:");
		metin = scan.nextLine();
		
		System.out.println("Aranan karakteri giriniz:");
		harf = scan.next().charAt(0);
		
		System.out.println("Aranan karakter sayýsý = " + kacadet(metin,harf));

	}

}
