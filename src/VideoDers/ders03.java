package VideoDers;

import java.util.Scanner;

public class ders03 {

	public static void main(String[] args) {
		//kullanýcýdan alýnan bir string içerinde kaç adet a karakteri var?
		
				Scanner scan = new Scanner(System.in);
				
				String kd;
				
				System.out.println("Bir yazý giriniz");
				kd = scan.nextLine();
				
				int i,sayac,uzunluk;
				
				uzunluk = kd.length();
				
				sayac = 0;
				
				for(i=0;i<uzunluk;i++){
					
					if(kd.charAt(i)=='a') sayac++;
					
				}
				
				System.out.println("String ifade de " + sayac + " a harfi vardýr");
				

	}

}
