package VideoDers;

class cokgen{
	protected int yukseklik;
	protected int genislik;
	
	public void set_genyuk(int a, int b){
		yukseklik = a;
		genislik = b;
	}
}

class dortgen extends cokgen{
	public int alan(){
		return yukseklik*genislik;
	} 
	
}

class dikUcgen extends cokgen{
	public int alan(){
		return yukseklik*genislik/2;
	}
}

public class ders20 {

	public static void main(String[] args) {
		dortgen d = new dortgen();
		
		d.set_genyuk(5, 10);
		System.out.println("Dörtgen alaný : " + d.alan());

		dikUcgen du = new dikUcgen();
		
		du.set_genyuk(8, 4);
		System.out.println("Dik üçgen alaný : " + du.alan());
		
	}

}
