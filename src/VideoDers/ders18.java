package VideoDers;

class statik {
	
	public void statikOlmayan(){
		System.out.println("Statik olmayan fonksiyon");
	}
	
	public static void statikOlan(){
		System.out.println("Statik olan");
	}
	
}


public class ders18 {

	public static void main(String[] args) {
		statik s = new statik();
		s.statikOlmayan();
		
		statik.statikOlan();
		

	}

}
