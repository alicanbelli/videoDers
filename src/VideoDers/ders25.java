package VideoDers;

//INTERFACE
/*
* Bir interface normal bir Java s�n�f�ndan farks�z bir �ekilde
tan�mlan�r. S�n�f tan�mlan�rken class yerine interface terimi kullan�l�r.

* Java�da tan�mlanm�� bir interface s�n�ftan, normal bir s�n�fta oldu�u gibi new() operat�r� ile
bir nesne olu�turulamaz
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
