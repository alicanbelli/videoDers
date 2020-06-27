package VideoDers;

//INTERFACE
/*
* Bir interface normal bir Java sýnýfýndan farksýz bir þekilde
tanýmlanýr. Sýnýf tanýmlanýrken class yerine interface terimi kullanýlýr.

* Java’da tanýmlanmýþ bir interface sýnýftan, normal bir sýnýfta olduðu gibi new() operatörü ile
bir nesne oluþturulamaz
*/

interface ogreni{
	
	public void ogrenciNumara();
	public void ogrenciAd();
	
}

class ogrenciSinifi implements ogreni{
	
	public void ogrenciNumara(){
		System.out.println("550");
	}
	
	public void ogrenciAd(){
		System.out.println("Ali");
	}
	
}

public class ders25 {

	public static void main(String[] args) {
		ogrenciSinifi s = new ogrenciSinifi();
		
		s.ogrenciAd();
		s.ogrenciNumara();
	}

}
