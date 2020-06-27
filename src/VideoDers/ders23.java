package VideoDers;

class anaSinif{
	public void OverridedMetot(){
		System.out.println("Burasý ana sýnýf");
	}
}

class altSinif extends anaSinif{
	public void OverridedMetot(){
		System.out.println("Burasý alt sýnýf");
	}
}

public class ders23 {

	public static void main(String[] args) {
		anaSinif obj1 = new anaSinif();
		anaSinif obj2 = new altSinif();

		obj1.OverridedMetot();
		obj2.OverridedMetot();
	}

}
