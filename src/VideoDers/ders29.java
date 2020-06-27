package VideoDers;

public class ders29 {	
	// not ortalamasý, sayýlarýn 0-100 arasýnda olmasý
	
	static void ortalama(int v,int f) {
		
		if(v>100 || f>100 || v<0 || f<0) {			
			throw new ArithmeticException("Notlar 0-100 aralýðýnda olmalý!"); 			
		} else {
			System.out.println("Ortalama : " + (v*0.40+f*0.6));
		}
		
	}
	

	public static void main(String[] args) {
		// throw exception	
		ortalama(-40, 100);

	}

}
