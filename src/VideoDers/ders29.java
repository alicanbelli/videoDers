package VideoDers;

public class ders29 {	
	// not ortalamas�, say�lar�n 0-100 aras�nda olmas�
	
	static void ortalama(int v,int f) {
		
		if(v>100 || f>100 || v<0 || f<0) {			
			throw new ArithmeticException("Notlar 0-100 aral���nda olmal�!"); 			
		} else {
			System.out.println("Ortalama : " + (v*0.40+f*0.6));
		}
		
	}
	

	public static void main(String[] args) {
		// throw exception	
		ortalama(-40, 100);

	}

}
