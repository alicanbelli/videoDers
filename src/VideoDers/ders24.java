package VideoDers;

// abstract sýnýflar ve metotlar
// soyut sýnýfa ait nesne yaratýlamaz 
// soyut sýnýf içinde en az bir soyut bir metot yer almalýdýr
// soyut sýnýf içinde somut metot olabilir
// constructor metodu tanýmlanabilir

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
