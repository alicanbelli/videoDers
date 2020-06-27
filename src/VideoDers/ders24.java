package VideoDers;

// abstract s�n�flar ve metotlar
// soyut s�n�fa ait nesne yarat�lamaz 
// soyut s�n�f i�inde en az bir soyut bir metot yer almal�d�r
// soyut s�n�f i�inde somut metot olabilir
// constructor metodu tan�mlanabilir

abstract class soyut{
	
	abstract void soyutMetot();
	
	void somutMetot(){
		System.out.println("Ben somut metotum");
	}
	
}

class somut extends soyut{
	void soyutMetot(){
		System.out.println("Ben soyut metodum");
	}
	
}

public class ders24 {

	public static void main(String[] args) {
		
		//soyut s = new soyut();
		
		somut s = new somut();
		s.somutMetot();
		s.soyutMetot();

	}

}
