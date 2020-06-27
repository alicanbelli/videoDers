package VideoDers;
/* Eriþim Seyiyeleri
 * 				Class    Package    Subclass   World
 * Public         E         E           E        E
 * Protected      E         E           E        H
 * Atanmamýþ      E         E           H        H
 * Private        E         H           H        H
 */

class erisim{
	public String ad;
	protected String Soyad;
	private int yas;
	
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
}



public class ders19 {

	public static void main(String[] args) {
		erisim ers = new erisim();
		
		ers.ad = "yasin";
		ers.Soyad ="saglam";
		ers.setYas(24);
		ers.getYas();

	}

}
