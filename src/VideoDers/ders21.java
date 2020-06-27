package VideoDers;

/* final deyimi ile
 * class oluþturulursa alt sýnýflar oluþturulamaz
 * method oluþtulursa alt sýnýflar tarafýndan override edilemez
 * deðiþken oluþturulursa sadece bir kere deðer atanabilir
 */

final class final_terimi{
	public final int a;
	
	final_terimi(){
		a=10;
	}
	
}

/* class fte extends final_terimi{
	
} */ //Böyle bir tanýmlama yapýlamaz

public class ders21 {

	public static void main(String[] args) {
		final_terimi ft = new final_terimi();
		
		//ft.a = 15; //böyle bir atama yapýlamaz

	}

}
