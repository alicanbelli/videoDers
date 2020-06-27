package VideoDers;

import java.util.Scanner;

public class ders08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sayac,ciftsayac,sayi;
		
		sayac=0;
		ciftsayac=0;
		
		do {
			
		System.out.println("Sayý giriniz. Çýkmak için -1");
		sayi = scan.nextInt();
		if(sayi==-1){
			break;
		} else {
			sayac++;
			if(sayi%2==0) ciftsayac++;
		}
			
		} while (true);
		
		System.out.println("Toplam sayi " + sayac);
		System.out.println("Çift sayý adedi " + ciftsayac);
		
	}

}
