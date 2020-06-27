package VideoDers;

public class ders34 {
	
	static int faktoriyel(int a) {
		if(a==1) return 1;
		return a*faktoriyel(a-1);
	}

	// 5! = 5*4*3*2*1
	
	
	static int topla(int a) {
		if(a==1) return 1;
		return a+topla(a-1);
	}
	
	public static void main(String[] args) {
		// Recursive Metotlar
		System.out.println(faktoriyel(7));
		
		System.out.println(topla(10));
		
		
	}

}
