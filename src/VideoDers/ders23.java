package VideoDers;

class anaSinif{
	public void OverridedMetot(){
		System.out.println("Buras� ana s�n�f");
	}
}

class altSinif extends anaSinif{
	public void OverridedMetot(){
		System.out.println("Buras� alt s�n�f");
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
