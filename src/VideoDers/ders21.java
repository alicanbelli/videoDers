package VideoDers;

/* final deyimi ile
 * class olu�turulursa alt s�n�flar olu�turulamaz
 * method olu�tulursa alt s�n�flar taraf�ndan override edilemez
 * de�i�ken olu�turulursa sadece bir kere de�er atanabilir
 */

final class final_terimi{
	public final int a;
	
	final_terimi(){
		a=10;
	}
	
}

/* class fte extends final_terimi{
	
} */ //B�yle bir tan�mlama yap�lamaz

public class ders21 {

	public static void main(String[] args) {
		final_terimi ft = new final_terimi();
		
		//ft.a = 15; //b�yle bir atama yap�lamaz

	}

}
